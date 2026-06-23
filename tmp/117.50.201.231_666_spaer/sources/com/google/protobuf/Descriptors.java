package com.google.protobuf;

import com.github.catvod.spider.merge.A.a;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.JavaFeaturesProto;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.TextFormat;
import com.google.protobuf.WireFormat;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@CheckReturnValue
public final class Descriptors {
    private static final Logger logger = Logger.getLogger(Descriptors.class.getName());
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Descriptor[] EMPTY_DESCRIPTORS = new Descriptor[0];
    private static final FieldDescriptor[] EMPTY_FIELD_DESCRIPTORS = new FieldDescriptor[0];
    private static final EnumDescriptor[] EMPTY_ENUM_DESCRIPTORS = new EnumDescriptor[0];
    private static final ServiceDescriptor[] EMPTY_SERVICE_DESCRIPTORS = new ServiceDescriptor[0];
    private static final OneofDescriptor[] EMPTY_ONEOF_DESCRIPTORS = new OneofDescriptor[0];
    private static final ConcurrentHashMap<Integer, DescriptorProtos.FeatureSet> FEATURE_CACHE = new ConcurrentHashMap<>();
    private static volatile DescriptorProtos.FeatureSetDefaults javaEditionDefaults = null;

    public final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final int[] extensionRangeLowerBounds;
        private final int[] extensionRangeUpperBounds;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FieldDescriptor[] fieldsSortedByNumber;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private volatile DescriptorProtos.MessageOptions options;
        private DescriptorProtos.DescriptorProto proto;
        private final int realOneofCount;

        /* JADX WARN: Illegal instructions before constructor call */
        private Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            super();
            if (descriptor == null) {
                this.parent = fileDescriptor;
            } else {
                this.parent = descriptor;
            }
            this.index = i;
            this.proto = descriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, descriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            this.oneofs = descriptorProto.getOneofDeclCount() > 0 ? new OneofDescriptor[descriptorProto.getOneofDeclCount()] : Descriptors.EMPTY_ONEOF_DESCRIPTORS;
            int i2 = 0;
            for (int i3 = 0; i3 < descriptorProto.getOneofDeclCount(); i3++) {
                this.oneofs[i3] = new OneofDescriptor(descriptorProto.getOneofDecl(i3), fileDescriptor, this, i3);
            }
            this.nestedTypes = descriptorProto.getNestedTypeCount() > 0 ? new Descriptor[descriptorProto.getNestedTypeCount()] : Descriptors.EMPTY_DESCRIPTORS;
            for (int i4 = 0; i4 < descriptorProto.getNestedTypeCount(); i4++) {
                this.nestedTypes[i4] = new Descriptor(descriptorProto.getNestedType(i4), fileDescriptor, this, i4);
            }
            this.enumTypes = descriptorProto.getEnumTypeCount() > 0 ? new EnumDescriptor[descriptorProto.getEnumTypeCount()] : Descriptors.EMPTY_ENUM_DESCRIPTORS;
            for (int i5 = 0; i5 < descriptorProto.getEnumTypeCount(); i5++) {
                this.enumTypes[i5] = new EnumDescriptor(descriptorProto.getEnumType(i5), fileDescriptor, this, i5);
            }
            this.fields = descriptorProto.getFieldCount() > 0 ? new FieldDescriptor[descriptorProto.getFieldCount()] : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            for (int i6 = 0; i6 < descriptorProto.getFieldCount(); i6++) {
                this.fields[i6] = new FieldDescriptor(descriptorProto.getField(i6), fileDescriptor, this, i6, false);
            }
            this.fieldsSortedByNumber = descriptorProto.getFieldCount() > 0 ? (FieldDescriptor[]) this.fields.clone() : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.extensions = descriptorProto.getExtensionCount() > 0 ? new FieldDescriptor[descriptorProto.getExtensionCount()] : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            for (int i7 = 0; i7 < descriptorProto.getExtensionCount(); i7++) {
                this.extensions[i7] = new FieldDescriptor(descriptorProto.getExtension(i7), fileDescriptor, this, i7, true);
            }
            for (int i8 = 0; i8 < descriptorProto.getOneofDeclCount(); i8++) {
                OneofDescriptor oneofDescriptor = this.oneofs[i8];
                oneofDescriptor.fields = new FieldDescriptor[oneofDescriptor.getFieldCount()];
                this.oneofs[i8].fieldCount = 0;
            }
            for (int i9 = 0; i9 < descriptorProto.getFieldCount(); i9++) {
                OneofDescriptor containingOneof = this.fields[i9].getContainingOneof();
                if (containingOneof != null) {
                    containingOneof.fields[OneofDescriptor.access$2908(containingOneof)] = this.fields[i9];
                }
            }
            int i10 = 0;
            for (OneofDescriptor oneofDescriptor2 : this.oneofs) {
                if (oneofDescriptor2.isSynthetic()) {
                    i10++;
                } else if (i10 > 0) {
                    throw new DescriptorValidationException(this, "Synthetic oneofs must come last.");
                }
            }
            this.realOneofCount = this.oneofs.length - i10;
            fileDescriptor.pool.addSymbol(this);
            if (descriptorProto.getExtensionRangeCount() <= 0) {
                this.extensionRangeLowerBounds = Descriptors.EMPTY_INT_ARRAY;
                this.extensionRangeUpperBounds = Descriptors.EMPTY_INT_ARRAY;
                return;
            }
            this.extensionRangeLowerBounds = new int[descriptorProto.getExtensionRangeCount()];
            this.extensionRangeUpperBounds = new int[descriptorProto.getExtensionRangeCount()];
            for (DescriptorProtos.DescriptorProto.ExtensionRange extensionRange : descriptorProto.getExtensionRangeList()) {
                this.extensionRangeLowerBounds[i2] = extensionRange.getStart();
                this.extensionRangeUpperBounds[i2] = extensionRange.getEnd();
                i2++;
            }
            Arrays.sort(this.extensionRangeLowerBounds);
            Arrays.sort(this.extensionRangeUpperBounds);
        }

        public Descriptor(String str) {
            String strSubstring;
            String strSubstring2;
            super();
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            this.index = 0;
            this.proto = DescriptorProtos.DescriptorProto.newBuilder().setName(strSubstring2).addExtensionRange(DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = Descriptors.EMPTY_DESCRIPTORS;
            this.enumTypes = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            this.fields = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.fieldsSortedByNumber = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.extensions = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            this.oneofs = Descriptors.EMPTY_ONEOF_DESCRIPTORS;
            this.realOneofCount = 0;
            FileDescriptor fileDescriptor = new FileDescriptor(strSubstring, this);
            this.file = fileDescriptor;
            this.parent = fileDescriptor;
            this.extensionRangeLowerBounds = new int[]{1};
            this.extensionRangeUpperBounds = new int[]{536870912};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            for (Descriptor descriptor : this.nestedTypes) {
                descriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.fields) {
                fieldDescriptor.crossLink();
            }
            Arrays.sort(this.fieldsSortedByNumber);
            validateNoDuplicateFieldNumbers();
            for (FieldDescriptor fieldDescriptor2 : this.extensions) {
                fieldDescriptor2.crossLink();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
            for (Descriptor descriptor : this.nestedTypes) {
                descriptor.resolveAllFeatures();
            }
            for (EnumDescriptor enumDescriptor : this.enumTypes) {
                enumDescriptor.resolveAllFeatures();
            }
            for (OneofDescriptor oneofDescriptor : this.oneofs) {
                oneofDescriptor.resolveAllFeatures();
            }
            for (FieldDescriptor fieldDescriptor : this.fields) {
                fieldDescriptor.resolveAllFeatures();
            }
            for (FieldDescriptor fieldDescriptor2 : this.extensions) {
                fieldDescriptor2.resolveAllFeatures();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.DescriptorProto descriptorProto) throws DescriptorValidationException {
            this.proto = descriptorProto;
            this.options = null;
            resolveFeatures(descriptorProto.getOptions().getFeatures());
            int i = 0;
            int i2 = 0;
            while (true) {
                Descriptor[] descriptorArr = this.nestedTypes;
                if (i2 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i2].setProto(descriptorProto.getNestedType(i2));
                i2++;
            }
            int i3 = 0;
            while (true) {
                OneofDescriptor[] oneofDescriptorArr = this.oneofs;
                if (i3 >= oneofDescriptorArr.length) {
                    break;
                }
                oneofDescriptorArr[i3].setProto(descriptorProto.getOneofDecl(i3));
                i3++;
            }
            int i4 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i4 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i4].setProto(descriptorProto.getEnumType(i4));
                i4++;
            }
            int i5 = 0;
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.fields;
                if (i5 >= fieldDescriptorArr.length) {
                    break;
                }
                fieldDescriptorArr[i5].setProto(descriptorProto.getField(i5));
                i5++;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr2 = this.extensions;
                if (i >= fieldDescriptorArr2.length) {
                    return;
                }
                fieldDescriptorArr2[i].setProto(descriptorProto.getExtension(i));
                i++;
            }
        }

        private void validateNoDuplicateFieldNumbers() throws DescriptorValidationException {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                FieldDescriptor[] fieldDescriptorArr = this.fieldsSortedByNumber;
                if (i2 >= fieldDescriptorArr.length) {
                    return;
                }
                FieldDescriptor fieldDescriptor = fieldDescriptorArr[i];
                FieldDescriptor fieldDescriptor2 = fieldDescriptorArr[i2];
                if (fieldDescriptor.getNumber() == fieldDescriptor2.getNumber()) {
                    throw new DescriptorValidationException(fieldDescriptor2, "Field number " + fieldDescriptor2.getNumber() + " has already been used in \"" + fieldDescriptor2.getContainingType().getFullName() + "\" by field \"" + fieldDescriptor.getName() + "\".");
                }
                i = i2;
            }
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof EnumDescriptor) {
                return (EnumDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof FieldDescriptor) {
                return (FieldDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findFieldByNumber(int i) {
            FieldDescriptor[] fieldDescriptorArr = this.fieldsSortedByNumber;
            return (FieldDescriptor) Descriptors.binarySearch(fieldDescriptorArr, fieldDescriptorArr.length, FieldDescriptor.NUMBER_GETTER, i);
        }

        public Descriptor findNestedTypeByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof Descriptor) {
                return (Descriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public DescriptorProtos.MessageOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.MessageOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public List<OneofDescriptor> getRealOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs).subList(0, this.realOneofCount));
        }

        public boolean isExtendable() {
            return !this.proto.getExtensionRangeList().isEmpty();
        }

        public boolean isExtensionNumber(int i) {
            int iBinarySearch = Arrays.binarySearch(this.extensionRangeLowerBounds, i);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            return iBinarySearch >= 0 && i < this.extensionRangeUpperBounds[iBinarySearch];
        }

        public boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            Iterator<String> it = this.proto.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i) {
            for (DescriptorProtos.DescriptorProto.ReservedRange reservedRange : this.proto.getReservedRangeList()) {
                if (reservedRange.getStart() <= i && i < reservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.DescriptorProto toProto() {
            return this.proto;
        }
    }

    final class DescriptorPool {
        private final boolean allowUnknownDependencies;
        private final Set<FileDescriptor> dependencies;
        private final Map<String, GenericDescriptor> descriptorsByName = new HashMap();

        final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            public PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                super();
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public FileDescriptor getFile() {
                return this.file;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public String getFullName() {
                return this.fullName;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public String getName() {
                return this.name;
            }

            @Override // com.google.protobuf.Descriptors.GenericDescriptor
            public Message toProto() {
                return this.file.toProto();
            }
        }

        enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        public DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z) {
            this.dependencies = Collections.newSetFromMap(new IdentityHashMap(fileDescriptorArr.length));
            this.allowUnknownDependencies = z;
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                this.dependencies.add(fileDescriptor);
                importPublicDependencies(fileDescriptor);
            }
            for (FileDescriptor fileDescriptor2 : this.dependencies) {
                try {
                    addPackage(fileDescriptor2.getPackage(), fileDescriptor2);
                } catch (DescriptorValidationException e) {
                    throw new AssertionError(e);
                }
            }
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor fileDescriptor2 : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(fileDescriptor2)) {
                    importPublicDependencies(fileDescriptor2);
                }
            }
        }

        public static void validateSymbolName(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            String name = genericDescriptor.getName();
            if (name.length() == 0) {
                throw new DescriptorValidationException(genericDescriptor, "Missing name.");
            }
            for (int i = 0; i < name.length(); i++) {
                char cCharAt = name.charAt(i);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i <= 0))) {
                    throw new DescriptorValidationException(genericDescriptor, a.j("\"", name, "\" is not a valid identifier."));
                }
            }
        }

        public void addPackage(String str, FileDescriptor fileDescriptor) throws DescriptorValidationException {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                addPackage(str.substring(0, iLastIndexOf), fileDescriptor);
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            GenericDescriptor genericDescriptorPut = this.descriptorsByName.put(str, new PackageDescriptor(strSubstring, str, fileDescriptor));
            if (genericDescriptorPut != null) {
                this.descriptorsByName.put(str, genericDescriptorPut);
                if (genericDescriptorPut instanceof PackageDescriptor) {
                    return;
                }
                throw new DescriptorValidationException(fileDescriptor, "\"" + strSubstring + "\" is already defined (as something other than a package) in file \"" + genericDescriptorPut.getFile().getName() + "\".");
            }
        }

        public void addSymbol(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            GenericDescriptor genericDescriptorPut = this.descriptorsByName.put(fullName, genericDescriptor);
            if (genericDescriptorPut != null) {
                this.descriptorsByName.put(fullName, genericDescriptorPut);
                if (genericDescriptor.getFile() != genericDescriptorPut.getFile()) {
                    throw new DescriptorValidationException(genericDescriptor, "\"" + fullName + "\" is already defined in file \"" + genericDescriptorPut.getFile().getName() + "\".");
                }
                int iLastIndexOf = fullName.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new DescriptorValidationException(genericDescriptor, a.j("\"", fullName, "\" is already defined."));
                }
                throw new DescriptorValidationException(genericDescriptor, "\"" + fullName.substring(iLastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, iLastIndexOf) + "\".");
            }
        }

        public GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }

        public GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = this.descriptorsByName.get(str);
            if (genericDescriptor != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor))))) {
                return genericDescriptor;
            }
            Iterator<FileDescriptor> it = this.dependencies.iterator();
            while (it.hasNext()) {
                GenericDescriptor genericDescriptor2 = it.next().pool.descriptorsByName.get(str);
                if (genericDescriptor2 != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor2)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor2))))) {
                    return genericDescriptor2;
                }
            }
            return null;
        }

        public boolean isAggregate(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor) || (genericDescriptor instanceof ServiceDescriptor);
        }

        public boolean isType(GenericDescriptor genericDescriptor) {
            return (genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor);
        }

        public GenericDescriptor lookupSymbol(String str, GenericDescriptor genericDescriptor, SearchFilter searchFilter) throws DescriptorValidationException {
            GenericDescriptor genericDescriptorFindSymbol;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                genericDescriptorFindSymbol = findSymbol(string, searchFilter);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb = new StringBuilder(genericDescriptor.getFullName());
                while (true) {
                    int iLastIndexOf = sb.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        genericDescriptorFindSymbol = findSymbol(str, searchFilter);
                        string = str;
                        break;
                    }
                    int i = iLastIndexOf + 1;
                    sb.setLength(i);
                    sb.append(strSubstring);
                    GenericDescriptor genericDescriptorFindSymbol2 = findSymbol(sb.toString(), SearchFilter.AGGREGATES_ONLY);
                    if (genericDescriptorFindSymbol2 != null) {
                        if (iIndexOf != -1) {
                            sb.setLength(i);
                            sb.append(str);
                            genericDescriptorFindSymbol = findSymbol(sb.toString(), searchFilter);
                        } else {
                            genericDescriptorFindSymbol = genericDescriptorFindSymbol2;
                        }
                        string = sb.toString();
                    } else {
                        sb.setLength(iLastIndexOf);
                    }
                }
            }
            if (genericDescriptorFindSymbol != null) {
                return genericDescriptorFindSymbol;
            }
            if (!this.allowUnknownDependencies || searchFilter != SearchFilter.TYPES_ONLY) {
                throw new DescriptorValidationException(genericDescriptor, a.j("\"", str, "\" is not defined."));
            }
            Descriptors.logger.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
            Descriptor descriptor = new Descriptor(string);
            this.dependencies.add(descriptor.getFile());
            return descriptor;
        }
    }

    public class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.getName() + ": " + str);
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            super(genericDescriptor.getFullName() + ": " + str);
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th) {
            this(genericDescriptor, str);
            initCause(th);
        }

        public String getDescription() {
            return this.description;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getProblemSymbolName() {
            return this.name;
        }
    }

    public final class EnumDescriptor extends GenericDescriptor implements Internal.EnumLiteMap<EnumValueDescriptor> {
        private ReferenceQueue<EnumValueDescriptor> cleanupQueue;
        private final Descriptor containingType;
        private final int distinctNumbers;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private volatile DescriptorProtos.EnumOptions options;
        private DescriptorProtos.EnumDescriptorProto proto;
        private Map<Integer, WeakReference<EnumValueDescriptor>> unknownValues;
        private final EnumValueDescriptor[] values;
        private final EnumValueDescriptor[] valuesSortedByNumber;

        class UnknownEnumValueReference extends WeakReference<EnumValueDescriptor> {
            private final int number;

            private UnknownEnumValueReference(int i, EnumValueDescriptor enumValueDescriptor) {
                super(enumValueDescriptor);
                this.number = i;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            super();
            this.unknownValues = null;
            this.cleanupQueue = null;
            if (descriptor == null) {
                this.parent = fileDescriptor;
            } else {
                this.parent = descriptor;
            }
            this.index = i;
            this.proto = enumDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, enumDescriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (enumDescriptorProto.getValueCount() == 0) {
                throw new DescriptorValidationException(this, "Enums must contain at least one value.");
            }
            this.values = new EnumValueDescriptor[enumDescriptorProto.getValueCount()];
            int i2 = 0;
            for (int i3 = 0; i3 < enumDescriptorProto.getValueCount(); i3++) {
                this.values[i3] = new EnumValueDescriptor(enumDescriptorProto.getValue(i3), fileDescriptor, this, i3);
            }
            EnumValueDescriptor[] enumValueDescriptorArr = (EnumValueDescriptor[]) this.values.clone();
            this.valuesSortedByNumber = enumValueDescriptorArr;
            Arrays.sort(enumValueDescriptorArr, EnumValueDescriptor.BY_NUMBER);
            for (int i4 = 1; i4 < enumDescriptorProto.getValueCount(); i4++) {
                EnumValueDescriptor[] enumValueDescriptorArr2 = this.valuesSortedByNumber;
                EnumValueDescriptor enumValueDescriptor = enumValueDescriptorArr2[i2];
                EnumValueDescriptor enumValueDescriptor2 = enumValueDescriptorArr2[i4];
                if (enumValueDescriptor.getNumber() != enumValueDescriptor2.getNumber()) {
                    i2++;
                    this.valuesSortedByNumber[i2] = enumValueDescriptor2;
                }
            }
            int i5 = i2 + 1;
            this.distinctNumbers = i5;
            Arrays.fill(this.valuesSortedByNumber, i5, enumDescriptorProto.getValueCount(), (Object) null);
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
            for (EnumValueDescriptor enumValueDescriptor : this.values) {
                enumValueDescriptor.resolveAllFeatures();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.EnumDescriptorProto enumDescriptorProto) throws DescriptorValidationException {
            this.proto = enumDescriptorProto;
            this.options = null;
            resolveFeatures(enumDescriptorProto.getOptions().getFeatures());
            int i = 0;
            while (true) {
                EnumValueDescriptor[] enumValueDescriptorArr = this.values;
                if (i >= enumValueDescriptorArr.length) {
                    return;
                }
                enumValueDescriptorArr[i].setProto(enumDescriptorProto.getValue(i));
                i++;
            }
        }

        public EnumValueDescriptor findValueByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof EnumValueDescriptor) {
                return (EnumValueDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        @Override // com.google.protobuf.Internal.EnumLiteMap
        public EnumValueDescriptor findValueByNumber(int i) {
            return (EnumValueDescriptor) Descriptors.binarySearch(this.valuesSortedByNumber, this.distinctNumbers, EnumValueDescriptor.NUMBER_GETTER, i);
        }

        public EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i) {
            EnumValueDescriptor enumValueDescriptor;
            EnumValueDescriptor enumValueDescriptorFindValueByNumber = findValueByNumber(i);
            if (enumValueDescriptorFindValueByNumber != null) {
                return enumValueDescriptorFindValueByNumber;
            }
            synchronized (this) {
                try {
                    if (this.cleanupQueue == null) {
                        this.cleanupQueue = new ReferenceQueue<>();
                        this.unknownValues = new HashMap();
                    } else {
                        while (true) {
                            UnknownEnumValueReference unknownEnumValueReference = (UnknownEnumValueReference) this.cleanupQueue.poll();
                            if (unknownEnumValueReference == null) {
                                break;
                            }
                            this.unknownValues.remove(Integer.valueOf(unknownEnumValueReference.number));
                        }
                    }
                    WeakReference<EnumValueDescriptor> weakReference = this.unknownValues.get(Integer.valueOf(i));
                    enumValueDescriptor = weakReference == null ? null : weakReference.get();
                    if (enumValueDescriptor == null) {
                        enumValueDescriptor = new EnumValueDescriptor(this, Integer.valueOf(i));
                        this.unknownValues.put(Integer.valueOf(i), new UnknownEnumValueReference(i, enumValueDescriptor));
                    }
                } finally {
                }
            }
            return enumValueDescriptor;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.EnumOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.EnumOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public int getUnknownEnumValueDescriptorCount() {
            return this.unknownValues.size();
        }

        public List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        public boolean isClosed() {
            return getFeatures().getEnumType() == DescriptorProtos.FeatureSet.EnumType.CLOSED;
        }

        public boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            Iterator<String> it = this.proto.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (it.next().equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i) {
            for (DescriptorProtos.EnumDescriptorProto.EnumReservedRange enumReservedRange : this.proto.getReservedRangeList()) {
                if (enumReservedRange.getStart() <= i && i <= enumReservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.EnumDescriptorProto toProto() {
            return this.proto;
        }
    }

    public final class EnumValueDescriptor extends GenericDescriptor implements Internal.EnumLite {
        static final Comparator<EnumValueDescriptor> BY_NUMBER = new Comparator<EnumValueDescriptor>() { // from class: com.google.protobuf.Descriptors.EnumValueDescriptor.1
            @Override // java.util.Comparator
            public int compare(EnumValueDescriptor enumValueDescriptor, EnumValueDescriptor enumValueDescriptor2) {
                return Integer.compare(enumValueDescriptor.getNumber(), enumValueDescriptor2.getNumber());
            }
        };
        static final NumberGetter<EnumValueDescriptor> NUMBER_GETTER = new NumberGetter<EnumValueDescriptor>() { // from class: com.google.protobuf.Descriptors.EnumValueDescriptor.2
            @Override // com.google.protobuf.Descriptors.NumberGetter
            public int getNumber(EnumValueDescriptor enumValueDescriptor) {
                return enumValueDescriptor.getNumber();
            }
        };
        private final String fullName;
        private final int index;
        private volatile DescriptorProtos.EnumValueOptions options;
        private DescriptorProtos.EnumValueDescriptorProto proto;
        private final EnumDescriptor type;

        private EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i) throws DescriptorValidationException {
            super();
            this.parent = enumDescriptor;
            this.index = i;
            this.proto = enumValueDescriptorProto;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + enumValueDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        private EnumValueDescriptor(EnumDescriptor enumDescriptor, Integer num) {
            super();
            DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProtoBuild = DescriptorProtos.EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + enumDescriptor.getName() + "_" + num).setNumber(num.intValue()).build();
            this.parent = enumDescriptor;
            this.index = -1;
            this.proto = enumValueDescriptorProtoBuild;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + enumValueDescriptorProtoBuild.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto) throws DescriptorValidationException {
            this.proto = enumValueDescriptorProto;
            this.options = null;
            resolveFeatures(enumValueDescriptorProto.getOptions().getFeatures());
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.type.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public int getNumber() {
            return this.proto.getNumber();
        }

        public DescriptorProtos.EnumValueOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.EnumValueOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public EnumDescriptor getType() {
            return this.type;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.EnumValueDescriptorProto toProto() {
            return this.proto;
        }

        public String toString() {
            return this.proto.getName();
        }
    }

    public final class FieldDescriptor extends GenericDescriptor implements Comparable<FieldDescriptor>, FieldSet.FieldDescriptorLite<FieldDescriptor> {
        private static final NumberGetter<FieldDescriptor> NUMBER_GETTER = new NumberGetter<FieldDescriptor>() { // from class: com.google.protobuf.Descriptors.FieldDescriptor.1
            @Override // com.google.protobuf.Descriptors.NumberGetter
            public int getNumber(FieldDescriptor fieldDescriptor) {
                return fieldDescriptor.getNumber();
            }
        };
        private static final WireFormat.FieldType[] table = WireFormat.FieldType.values();
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final boolean isProto3Optional;
        private volatile boolean isReportable;
        private String jsonName;
        private Descriptor messageType;
        private volatile DescriptorProtos.FieldOptions options;
        private DescriptorProtos.FieldDescriptorProto proto;
        private volatile Sensitivity sensitivity;
        private Type type;

        public enum JavaType {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);

            private final Object defaultDefault;

            JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        enum Sensitivity {
            UNKNOWN,
            SENSITIVE,
            NOT_SENSITIVE
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public final class Type {
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type BOOL;
            public static final Type BYTES;
            public static final Type ENUM;
            public static final Type FIXED32;
            public static final Type FIXED64;
            public static final Type GROUP;
            public static final Type INT32;
            public static final Type INT64;
            public static final Type MESSAGE;
            public static final Type SFIXED32;
            public static final Type SFIXED64;
            public static final Type SINT32;
            public static final Type SINT64;
            public static final Type STRING;
            public static final Type UINT32;
            public static final Type UINT64;
            private static final Type[] types;
            private final JavaType javaType;
            public static final Type DOUBLE = new Type("DOUBLE", 0, JavaType.DOUBLE);
            public static final Type FLOAT = new Type("FLOAT", 1, JavaType.FLOAT);

            private static /* synthetic */ Type[] $values() {
                return new Type[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
            }

            static {
                JavaType javaType = JavaType.LONG;
                INT64 = new Type("INT64", 2, javaType);
                UINT64 = new Type("UINT64", 3, javaType);
                JavaType javaType2 = JavaType.INT;
                INT32 = new Type("INT32", 4, javaType2);
                FIXED64 = new Type("FIXED64", 5, javaType);
                FIXED32 = new Type("FIXED32", 6, javaType2);
                BOOL = new Type("BOOL", 7, JavaType.BOOLEAN);
                STRING = new Type("STRING", 8, JavaType.STRING);
                JavaType javaType3 = JavaType.MESSAGE;
                GROUP = new Type("GROUP", 9, javaType3);
                MESSAGE = new Type("MESSAGE", 10, javaType3);
                BYTES = new Type("BYTES", 11, JavaType.BYTE_STRING);
                UINT32 = new Type("UINT32", 12, javaType2);
                ENUM = new Type("ENUM", 13, JavaType.ENUM);
                SFIXED32 = new Type("SFIXED32", 14, javaType2);
                SFIXED64 = new Type("SFIXED64", 15, javaType);
                SINT32 = new Type("SINT32", 16, javaType2);
                SINT64 = new Type("SINT64", 17, javaType);
                $VALUES = $values();
                types = values();
            }

            private Type(String str, int i, JavaType javaType) {
                this.javaType = javaType;
            }

            public static Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type) {
                return types[type.getNumber() - 1];
            }

            public static Type valueOf(String str) {
                return (Type) java.lang.Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public JavaType getJavaType() {
                return this.javaType;
            }

            public DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
            }
        }

        static {
            if (Type.types.length != DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, boolean z) throws DescriptorValidationException {
            super();
            this.sensitivity = Sensitivity.UNKNOWN;
            this.isReportable = false;
            this.parent = descriptor;
            this.index = i;
            this.proto = fieldDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, fieldDescriptorProto.getName());
            this.file = fileDescriptor;
            if (fieldDescriptorProto.hasType()) {
                this.type = Type.valueOf(fieldDescriptorProto.getType());
            }
            this.isProto3Optional = fieldDescriptorProto.getProto3Optional();
            if (getNumber() <= 0) {
                throw new DescriptorValidationException(this, "Field numbers must be positive integers.");
            }
            if (z) {
                if (!fieldDescriptorProto.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee not set for extension field.");
                }
                this.containingType = null;
                if (descriptor != null) {
                    this.extensionScope = descriptor;
                } else {
                    this.extensionScope = null;
                    this.parent = fileDescriptor;
                }
                if (fieldDescriptorProto.hasOneofIndex()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index set for extension field.");
                }
                this.containingOneof = null;
            } else {
                if (fieldDescriptorProto.hasExtendee()) {
                    throw new DescriptorValidationException(this, "FieldDescriptorProto.extendee set for non-extension field.");
                }
                this.containingType = descriptor;
                if (!fieldDescriptorProto.hasOneofIndex()) {
                    this.containingOneof = null;
                } else {
                    if (fieldDescriptorProto.getOneofIndex() < 0 || fieldDescriptorProto.getOneofIndex() >= descriptor.toProto().getOneofDeclCount()) {
                        throw new DescriptorValidationException(this, "FieldDescriptorProto.oneof_index is out of range for type " + descriptor.getName());
                    }
                    OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(fieldDescriptorProto.getOneofIndex());
                    this.containingOneof = oneofDescriptor;
                    OneofDescriptor.access$2908(oneofDescriptor);
                    this.parent = this.containingOneof;
                }
                this.extensionScope = null;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        private List<Boolean> calculateSensitivityData() {
            Sensitivity sensitivity = this.sensitivity;
            Sensitivity sensitivity2 = Sensitivity.UNKNOWN;
            if (sensitivity == sensitivity2) {
                synchronized (this) {
                    try {
                        if (this.sensitivity == sensitivity2) {
                            boolean debugRedact = this.proto.getOptions().getDebugRedact();
                            for (Map.Entry<FieldDescriptor, Object> entry : this.proto.getOptions().getAllFields().entrySet()) {
                                List<Boolean> listIsOptionSensitive = isOptionSensitive(entry.getKey(), entry.getValue());
                                debugRedact = debugRedact || listIsOptionSensitive.get(0).booleanValue();
                                this.isReportable = listIsOptionSensitive.get(1).booleanValue();
                                if (debugRedact) {
                                    break;
                                }
                            }
                            this.sensitivity = debugRedact ? Sensitivity.SENSITIVE : Sensitivity.NOT_SENSITIVE;
                        }
                    } finally {
                    }
                }
            }
            return Arrays.asList(Boolean.valueOf(this.sensitivity == Sensitivity.SENSITIVE), Boolean.valueOf(this.isReportable));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            if (this.proto.hasExtendee()) {
                GenericDescriptor genericDescriptorLookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!(genericDescriptorLookupSymbol instanceof Descriptor)) {
                    throw new DescriptorValidationException(this, "\"" + this.proto.getExtendee() + "\" is not a message type.");
                }
                this.containingType = (Descriptor) genericDescriptorLookupSymbol;
                if (!getContainingType().isExtensionNumber(getNumber())) {
                    throw new DescriptorValidationException(this, "\"" + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.");
                }
            }
            if (this.proto.hasTypeName()) {
                GenericDescriptor genericDescriptorLookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (genericDescriptorLookupSymbol2 instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else {
                        if (!(genericDescriptorLookupSymbol2 instanceof EnumDescriptor)) {
                            throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not a type.");
                        }
                        this.type = Type.ENUM;
                    }
                }
                if (this.type.getJavaType() == JavaType.MESSAGE) {
                    if (!(genericDescriptorLookupSymbol2 instanceof Descriptor)) {
                        throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not a message type.");
                    }
                    this.messageType = (Descriptor) genericDescriptorLookupSymbol2;
                    if (this.proto.hasDefaultValue()) {
                        throw new DescriptorValidationException(this, "Messages can't have default values.");
                    }
                } else {
                    if (this.type.getJavaType() != JavaType.ENUM) {
                        throw new DescriptorValidationException(this, "Field with primitive type has type_name.");
                    }
                    if (!(genericDescriptorLookupSymbol2 instanceof EnumDescriptor)) {
                        throw new DescriptorValidationException(this, "\"" + this.proto.getTypeName() + "\" is not an enum type.");
                    }
                    this.enumType = (EnumDescriptor) genericDescriptorLookupSymbol2;
                }
            } else if (this.type.getJavaType() == JavaType.MESSAGE || this.type.getJavaType() == JavaType.ENUM) {
                throw new DescriptorValidationException(this, "Field with message or enum type missing type_name.");
            }
            if (this.proto.getOptions().getPacked() && !isPackable()) {
                throw new DescriptorValidationException(this, "[packed = true] can only be specified for repeated primitive fields.");
            }
            if (!this.proto.hasDefaultValue()) {
                if (isRepeated()) {
                    this.defaultValue = Collections.emptyList();
                    return;
                }
                int iOrdinal = this.type.getJavaType().ordinal();
                if (iOrdinal == 7) {
                    this.defaultValue = this.enumType.getValues().get(0);
                    return;
                } else if (iOrdinal != 8) {
                    this.defaultValue = this.type.getJavaType().defaultDefault;
                    return;
                } else {
                    this.defaultValue = null;
                    return;
                }
            }
            if (isRepeated()) {
                throw new DescriptorValidationException(this, "Repeated fields cannot have default values.");
            }
            try {
                switch (this.type.ordinal()) {
                    case 0:
                        if (this.proto.getDefaultValue().equals("inf")) {
                            this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                            return;
                        }
                        if (this.proto.getDefaultValue().equals("-inf")) {
                            this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                            return;
                        } else if (this.proto.getDefaultValue().equals("nan")) {
                            this.defaultValue = Double.valueOf(Double.NaN);
                            return;
                        } else {
                            this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                            return;
                        }
                    case 1:
                        if (this.proto.getDefaultValue().equals("inf")) {
                            this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                            return;
                        }
                        if (this.proto.getDefaultValue().equals("-inf")) {
                            this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                            return;
                        } else if (this.proto.getDefaultValue().equals("nan")) {
                            this.defaultValue = Float.valueOf(Float.NaN);
                            return;
                        } else {
                            this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                            return;
                        }
                    case 2:
                    case 15:
                    case 17:
                        this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                        return;
                    case 3:
                    case 5:
                        this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                        return;
                    case 4:
                    case 14:
                    case 16:
                        this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                        return;
                    case 6:
                    case 12:
                        this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                        return;
                    case 7:
                        this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                        return;
                    case 8:
                        this.defaultValue = this.proto.getDefaultValue();
                        return;
                    case 9:
                    case 10:
                        throw new DescriptorValidationException(this, "Message type had default value.");
                    case 11:
                        try {
                            this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                            return;
                        } catch (TextFormat.InvalidEscapeSequenceException e) {
                            throw new DescriptorValidationException(this, "Couldn't parse default value: " + e.getMessage(), e);
                        }
                    case 13:
                        EnumValueDescriptor enumValueDescriptorFindValueByName = this.enumType.findValueByName(this.proto.getDefaultValue());
                        this.defaultValue = enumValueDescriptorFindValueByName;
                        if (enumValueDescriptorFindValueByName != null) {
                            return;
                        }
                        throw new DescriptorValidationException(this, "Unknown enum default value: \"" + this.proto.getDefaultValue() + '\"');
                    default:
                        return;
                }
            } catch (NumberFormatException e2) {
                throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.proto.getDefaultValue() + '\"', e2);
            }
            throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.proto.getDefaultValue() + '\"', e2);
        }

        private static String fieldNameToJsonName(String str) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '_') {
                    z = true;
                } else if (z) {
                    if ('a' <= cCharAt && cCharAt <= 'z') {
                        cCharAt = (char) (cCharAt - ' ');
                    }
                    sb.append(cCharAt);
                    z = false;
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }

        private List<Boolean> isOptionSensitive(FieldDescriptor fieldDescriptor, Object obj) {
            if (fieldDescriptor.getType() == Type.ENUM) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        if (((EnumValueDescriptor) it.next()).getOptions().getDebugRedact()) {
                            return Arrays.asList(Boolean.TRUE, Boolean.FALSE);
                        }
                    }
                } else if (((EnumValueDescriptor) obj).getOptions().getDebugRedact()) {
                    return Arrays.asList(Boolean.TRUE, Boolean.FALSE);
                }
            } else if (fieldDescriptor.getJavaType() == JavaType.MESSAGE) {
                if (fieldDescriptor.isRepeated()) {
                    Iterator it2 = ((List) obj).iterator();
                    while (it2.hasNext()) {
                        for (Map.Entry<FieldDescriptor, Object> entry : ((Message) it2.next()).getAllFields().entrySet()) {
                            List<Boolean> listIsOptionSensitive = isOptionSensitive(entry.getKey(), entry.getValue());
                            if (listIsOptionSensitive.get(0).booleanValue()) {
                                return listIsOptionSensitive;
                            }
                        }
                    }
                } else {
                    for (Map.Entry<FieldDescriptor, Object> entry2 : ((Message) obj).getAllFields().entrySet()) {
                        List<Boolean> listIsOptionSensitive2 = isOptionSensitive(entry2.getKey(), entry2.getValue());
                        if (listIsOptionSensitive2.get(0).booleanValue()) {
                            return listIsOptionSensitive2;
                        }
                    }
                }
            }
            Boolean bool = Boolean.FALSE;
            return Arrays.asList(bool, bool);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) throws DescriptorValidationException {
            this.proto = fieldDescriptorProto;
            this.options = null;
            resolveFeatures(fieldDescriptorProto.getOptions().getFeatures());
        }

        @Override // java.lang.Comparable
        public int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        public OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            throw new UnsupportedOperationException(a.j("This field is not of enum type. (", this.fullName, ")"));
        }

        public Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            throw new UnsupportedOperationException(a.j("This field is not an extension. (", this.fullName, ")"));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public JavaType getJavaType() {
            return getType().getJavaType();
        }

        public String getJsonName() {
            String str = this.jsonName;
            if (str != null) {
                return str;
            }
            if (this.proto.hasJsonName()) {
                String jsonName = this.proto.getJsonName();
                this.jsonName = jsonName;
                return jsonName;
            }
            String strFieldNameToJsonName = fieldNameToJsonName(this.proto.getName());
            this.jsonName = strFieldNameToJsonName;
            return strFieldNameToJsonName;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return table[getType().ordinal()];
        }

        public Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            throw new UnsupportedOperationException(a.j("This field is not of message type. (", this.fullName, ")"));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.proto.getNumber();
        }

        public DescriptorProtos.FieldOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.FieldOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public OneofDescriptor getRealContainingOneof() {
            OneofDescriptor oneofDescriptor = this.containingOneof;
            if (oneofDescriptor == null || oneofDescriptor.isSynthetic()) {
                return null;
            }
            return this.containingOneof;
        }

        public Type getType() {
            Descriptor descriptor;
            Descriptor descriptor2;
            return (this.type != Type.MESSAGE || ((descriptor = this.messageType) != null && descriptor.toProto().getOptions().getMapEntry()) || (((descriptor2 = this.containingType) != null && descriptor2.toProto().getOptions().getMapEntry()) || this.features == null || getFeatures().getMessageEncoding() != DescriptorProtos.FeatureSet.MessageEncoding.DELIMITED)) ? this.type : Type.GROUP;
        }

        public boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public boolean hasInferredLegacyProtoFeatures() {
            if (getFile().getEdition().getNumber() >= DescriptorProtos.Edition.EDITION_2023.getNumber()) {
                return false;
            }
            if (this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED || this.proto.getType() == DescriptorProtos.FieldDescriptorProto.Type.TYPE_GROUP || this.proto.getOptions().getPacked()) {
                return true;
            }
            return getFile().getEdition() == DescriptorProtos.Edition.EDITION_PROTO3 && this.proto.getOptions().hasPacked() && !this.proto.getOptions().getPacked();
        }

        public boolean hasOptionalKeyword() {
            return this.isProto3Optional || (this.file.getEdition() == DescriptorProtos.Edition.EDITION_PROTO2 && !isRequired() && !isRepeated() && getContainingOneof() == null);
        }

        public boolean hasPresence() {
            if (isRepeated()) {
                return false;
            }
            return this.isProto3Optional || getType() == Type.MESSAGE || getType() == Type.GROUP || isExtension() || getContainingOneof() != null || getFeatures().getFieldPresence() != DescriptorProtos.FeatureSet.FieldPresence.IMPLICIT;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FeatureSet inferLegacyProtoFeatures() {
            DescriptorProtos.FeatureSet.Builder builderNewBuilder = DescriptorProtos.FeatureSet.newBuilder();
            if (getFile().getEdition().getNumber() >= DescriptorProtos.Edition.EDITION_2023.getNumber()) {
                return builderNewBuilder.build();
            }
            if (this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED) {
                builderNewBuilder.setFieldPresence(DescriptorProtos.FeatureSet.FieldPresence.LEGACY_REQUIRED);
            }
            if (this.proto.getType() == DescriptorProtos.FieldDescriptorProto.Type.TYPE_GROUP) {
                builderNewBuilder.setMessageEncoding(DescriptorProtos.FeatureSet.MessageEncoding.DELIMITED);
            }
            if (getFile().getEdition() == DescriptorProtos.Edition.EDITION_PROTO2 && this.proto.getOptions().getPacked()) {
                builderNewBuilder.setRepeatedFieldEncoding(DescriptorProtos.FeatureSet.RepeatedFieldEncoding.PACKED);
            }
            if (getFile().getEdition() == DescriptorProtos.Edition.EDITION_PROTO3 && this.proto.getOptions().hasPacked() && !this.proto.getOptions().getPacked()) {
                builderNewBuilder.setRepeatedFieldEncoding(DescriptorProtos.FeatureSet.RepeatedFieldEncoding.EXPANDED);
            }
            return builderNewBuilder.build();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }

        public boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public boolean isGroupLike() {
            if (getType() != Type.GROUP || !getMessageType().getName().toLowerCase().equals(getName()) || getMessageType().getFile() != getFile()) {
                return false;
            }
            if (isExtension()) {
                if (getMessageType().getContainingType() != getExtensionScope()) {
                    return false;
                }
            } else if (getMessageType().getContainingType() != getContainingType()) {
                return false;
            }
            return true;
        }

        public boolean isMapField() {
            return getType() == Type.MESSAGE && isRepeated() && getMessageType().toProto().getOptions().getMapEntry();
        }

        @Deprecated
        public boolean isOptional() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL && getFeatures().getFieldPresence() != DescriptorProtos.FeatureSet.FieldPresence.LEGACY_REQUIRED;
        }

        public boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            if (isPackable()) {
                return getFeatures().getRepeatedFieldEncoding().equals(DescriptorProtos.FeatureSet.RepeatedFieldEncoding.PACKED);
            }
            return false;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED;
        }

        public boolean isReportable() {
            return calculateSensitivityData().get(1).booleanValue();
        }

        public boolean isRequired() {
            return getFeatures().getFieldPresence() == DescriptorProtos.FeatureSet.FieldPresence.LEGACY_REQUIRED;
        }

        public boolean isSensitive() {
            return calculateSensitivityData().get(0).booleanValue();
        }

        public boolean legacyEnumFieldTreatedAsClosed() {
            if (getFile().getDependencies().isEmpty()) {
                return getType() == Type.ENUM && this.enumType.isClosed();
            }
            if (getType() == Type.ENUM) {
                return ((JavaFeaturesProto.JavaFeatures) getFeatures().getExtension(JavaFeaturesProto.java_)).getLegacyClosedEnum() || this.enumType.isClosed();
            }
            return false;
        }

        public boolean needsUtf8Check() {
            if (getType() != Type.STRING) {
                return false;
            }
            if (getContainingType().toProto().getOptions().getMapEntry() || ((JavaFeaturesProto.JavaFeatures) getFeatures().getExtension(JavaFeaturesProto.java_)).getUtf8Validation().equals(JavaFeaturesProto.JavaFeatures.Utf8Validation.VERIFY)) {
                return true;
            }
            return getFeatures().getUtf8Validation().equals(DescriptorProtos.FeatureSet.Utf8Validation.VERIFY);
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FieldDescriptorProto toProto() {
            return this.proto;
        }

        public String toString() {
            return getFullName();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public void validateFeatures() throws DescriptorValidationException {
            Descriptor descriptor = this.containingType;
            if (descriptor != null && descriptor.toProto().getOptions().getMessageSetWireFormat() && isExtension()) {
                if (isRequired() || isRepeated() || getType() != Type.MESSAGE) {
                    throw new DescriptorValidationException(this, "Extensions of MessageSets may not be required or repeated messages.");
                }
            }
        }
    }

    public final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private volatile boolean featuresResolved;
        private final Descriptor[] messageTypes;
        private volatile DescriptorProtos.FileOptions options;
        private final DescriptorPool pool;
        private DescriptorProtos.FileDescriptorProto proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        @Deprecated
        public interface InternalDescriptorAssigner {
            ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private FileDescriptor(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z) throws DescriptorValidationException {
            super();
            this.pool = descriptorPool;
            this.proto = fileDescriptorProto;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            this.featuresResolved = false;
            HashMap map = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                map.put(fileDescriptor.getName(), fileDescriptor);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < fileDescriptorProto.getPublicDependencyCount(); i++) {
                int publicDependency = fileDescriptorProto.getPublicDependency(i);
                if (publicDependency < 0 || publicDependency >= fileDescriptorProto.getDependencyCount()) {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.");
                }
                String dependency = fileDescriptorProto.getDependency(publicDependency);
                FileDescriptor fileDescriptor2 = (FileDescriptor) map.get(dependency);
                if (fileDescriptor2 != null) {
                    arrayList.add(fileDescriptor2);
                } else if (!z) {
                    throw new DescriptorValidationException(this, a.d("Invalid public dependency: ", dependency));
                }
            }
            FileDescriptor[] fileDescriptorArr2 = new FileDescriptor[arrayList.size()];
            this.publicDependencies = fileDescriptorArr2;
            arrayList.toArray(fileDescriptorArr2);
            descriptorPool.addPackage(getPackage(), this);
            this.messageTypes = fileDescriptorProto.getMessageTypeCount() > 0 ? new Descriptor[fileDescriptorProto.getMessageTypeCount()] : Descriptors.EMPTY_DESCRIPTORS;
            for (int i2 = 0; i2 < fileDescriptorProto.getMessageTypeCount(); i2++) {
                this.messageTypes[i2] = new Descriptor(fileDescriptorProto.getMessageType(i2), this, null, i2);
            }
            this.enumTypes = fileDescriptorProto.getEnumTypeCount() > 0 ? new EnumDescriptor[fileDescriptorProto.getEnumTypeCount()] : Descriptors.EMPTY_ENUM_DESCRIPTORS;
            for (int i3 = 0; i3 < fileDescriptorProto.getEnumTypeCount(); i3++) {
                this.enumTypes[i3] = new EnumDescriptor(fileDescriptorProto.getEnumType(i3), this, null, i3);
            }
            this.services = fileDescriptorProto.getServiceCount() > 0 ? new ServiceDescriptor[fileDescriptorProto.getServiceCount()] : Descriptors.EMPTY_SERVICE_DESCRIPTORS;
            for (int i4 = 0; i4 < fileDescriptorProto.getServiceCount(); i4++) {
                this.services[i4] = new ServiceDescriptor(fileDescriptorProto.getService(i4), this, i4);
            }
            this.extensions = fileDescriptorProto.getExtensionCount() > 0 ? new FieldDescriptor[fileDescriptorProto.getExtensionCount()] : Descriptors.EMPTY_FIELD_DESCRIPTORS;
            for (int i5 = 0; i5 < fileDescriptorProto.getExtensionCount(); i5++) {
                this.extensions[i5] = new FieldDescriptor(fileDescriptorProto.getExtension(i5), this, null, i5, true);
            }
        }

        public FileDescriptor(String str, Descriptor descriptor) throws DescriptorValidationException {
            super();
            this.parent = null;
            DescriptorPool descriptorPool = new DescriptorPool(new FileDescriptor[0], true);
            this.pool = descriptorPool;
            this.proto = DescriptorProtos.FileDescriptorProto.newBuilder().setName(descriptor.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.featuresResolved = false;
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = Descriptors.EMPTY_ENUM_DESCRIPTORS;
            this.services = Descriptors.EMPTY_SERVICE_DESCRIPTORS;
            this.extensions = Descriptors.EMPTY_FIELD_DESCRIPTORS;
            descriptorPool.addPackage(str, this);
            descriptorPool.addSymbol(descriptor);
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr) {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, false);
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z) {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, z, false);
        }

        private static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z, boolean z2) throws DescriptorValidationException {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z), z);
            fileDescriptor.crossLink();
            if (!z2) {
                fileDescriptor.resolveAllFeaturesInternal();
            }
            return fileDescriptor;
        }

        private void crossLink() throws DescriptorValidationException {
            for (Descriptor descriptor : this.messageTypes) {
                descriptor.crossLink();
            }
            for (ServiceDescriptor serviceDescriptor : this.services) {
                serviceDescriptor.crossLink();
            }
            for (FieldDescriptor fieldDescriptor : this.extensions) {
                fieldDescriptor.crossLink();
            }
        }

        private static FileDescriptor[] findDescriptors(Class<?> cls, String[] strArr, String[] strArr2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < strArr.length; i++) {
                try {
                    arrayList.add((FileDescriptor) cls.getClassLoader().loadClass(strArr[i]).getField("descriptor").get(null));
                } catch (Exception unused) {
                    Descriptors.logger.warning("Descriptors for \"" + strArr2[i] + "\" can not be found.");
                }
            }
            return (FileDescriptor[]) arrayList.toArray(new FileDescriptor[0]);
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3) {
            return internalBuildGeneratedFileFrom(strArr, findDescriptors(cls, strArr2, strArr3));
        }

        public static FileDescriptor internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr) {
            try {
                DescriptorProtos.FileDescriptorProto from = DescriptorProtos.FileDescriptorProto.parseFrom(latin1Cat(strArr));
                try {
                    return buildFrom(from, fileDescriptorArr, true, true);
                } catch (DescriptorValidationException e) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e);
                }
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
            }
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, ExtensionRegistry extensionRegistry) {
            try {
                fileDescriptor.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(fileDescriptor.proto.toByteString(), extensionRegistry));
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e);
            }
        }

        private static byte[] latin1Cat(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(Internal.ISO_8859_1);
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            return sb.toString().getBytes(Internal.ISO_8859_1);
        }

        private void resolveAllFeaturesInternal() {
            if (this.featuresResolved) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.featuresResolved) {
                        return;
                    }
                    resolveFeatures(this.proto.getOptions().getFeatures());
                    for (Descriptor descriptor : this.messageTypes) {
                        descriptor.resolveAllFeatures();
                    }
                    for (EnumDescriptor enumDescriptor : this.enumTypes) {
                        enumDescriptor.resolveAllFeatures();
                    }
                    for (ServiceDescriptor serviceDescriptor : this.services) {
                        serviceDescriptor.resolveAllFeatures();
                    }
                    for (FieldDescriptor fieldDescriptor : this.extensions) {
                        fieldDescriptor.resolveAllFeatures();
                    }
                    this.featuresResolved = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private synchronized void setProto(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            int i;
            int i2;
            try {
                this.proto = fileDescriptorProto;
                this.options = null;
                try {
                    resolveFeatures(fileDescriptorProto.getOptions().getFeatures());
                    i = 0;
                    i2 = 0;
                } catch (DescriptorValidationException e) {
                    throw new IllegalArgumentException("Invalid features for \"" + fileDescriptorProto.getName() + "\".", e);
                }
            } catch (Throwable th) {
                throw th;
            }
            while (true) {
                Descriptor[] descriptorArr = this.messageTypes;
                if (i2 >= descriptorArr.length) {
                    break;
                }
                descriptorArr[i2].setProto(fileDescriptorProto.getMessageType(i2));
                i2++;
                throw th;
            }
            int i3 = 0;
            while (true) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                if (i3 >= enumDescriptorArr.length) {
                    break;
                }
                enumDescriptorArr[i3].setProto(fileDescriptorProto.getEnumType(i3));
                i3++;
                throw th;
            }
            int i4 = 0;
            while (true) {
                ServiceDescriptor[] serviceDescriptorArr = this.services;
                if (i4 >= serviceDescriptorArr.length) {
                    break;
                }
                serviceDescriptorArr[i4].setProto(fileDescriptorProto.getService(i4));
                i4++;
                throw th;
            }
            while (true) {
                FieldDescriptor[] fieldDescriptorArr = this.extensions;
                if (i < fieldDescriptorArr.length) {
                    fieldDescriptorArr[i].setProto(fileDescriptorProto.getExtension(i));
                    i++;
                }
            }
        }

        public void copyHeadingTo(DescriptorProtos.FileDescriptorProto.Builder builder) {
            builder.setName(getName()).setSyntax(this.proto.getSyntax());
            if (!getPackage().isEmpty()) {
                builder.setPackage(getPackage());
            }
            if (this.proto.getSyntax().equals("editions")) {
                builder.setEdition(this.proto.getEdition());
            }
            if (!this.proto.hasOptions() || this.proto.getOptions().equals(DescriptorProtos.FileOptions.getDefaultInstance())) {
                return;
            }
            builder.setOptions(this.proto.getOptions());
        }

        public EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof EnumDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (EnumDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof FieldDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (FieldDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof Descriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (Descriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + '.' + str;
            }
            GenericDescriptor genericDescriptorFindSymbol = this.pool.findSymbol(str);
            if ((genericDescriptorFindSymbol instanceof ServiceDescriptor) && genericDescriptorFindSymbol.getFile() == this) {
                return (ServiceDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        public List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public DescriptorProtos.Edition getEdition() {
            String syntax = this.proto.getSyntax();
            syntax.getClass();
            return !syntax.equals("proto3") ? !syntax.equals("editions") ? DescriptorProtos.Edition.EDITION_PROTO2 : this.proto.getEdition() : DescriptorProtos.Edition.EDITION_PROTO3;
        }

        public List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.proto.getName();
        }

        public List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.FileOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.FileOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public String getPackage() {
            return this.proto.getPackage();
        }

        public List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public boolean hasInferredLegacyProtoFeatures() {
            return getEdition().getNumber() < DescriptorProtos.Edition.EDITION_2023.getNumber() && getEdition() == DescriptorProtos.Edition.EDITION_PROTO2 && this.proto.getOptions().getJavaStringCheckUtf8();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FeatureSet inferLegacyProtoFeatures() {
            DescriptorProtos.FeatureSet.Builder builderNewBuilder = DescriptorProtos.FeatureSet.newBuilder();
            if (getEdition().getNumber() >= DescriptorProtos.Edition.EDITION_2023.getNumber()) {
                return builderNewBuilder.build();
            }
            if (getEdition() == DescriptorProtos.Edition.EDITION_PROTO2 && this.proto.getOptions().getJavaStringCheckUtf8()) {
                builderNewBuilder.setExtension(JavaFeaturesProto.java_, JavaFeaturesProto.JavaFeatures.newBuilder().setUtf8Validation(JavaFeaturesProto.JavaFeatures.Utf8Validation.VERIFY).build());
            }
            return builderNewBuilder.build();
        }

        public void resolveAllFeaturesImmutable() {
            try {
                resolveAllFeaturesInternal();
            } catch (DescriptorValidationException e) {
                throw new IllegalArgumentException("Invalid features for \"" + this.proto.getName() + "\".", e);
            }
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.FileDescriptorProto toProto() {
            return this.proto;
        }
    }

    public abstract class GenericDescriptor {
        volatile DescriptorProtos.FeatureSet features;
        GenericDescriptor parent;

        private GenericDescriptor() {
        }

        public DescriptorProtos.FeatureSet getFeatures() {
            if (this.features == null && (getFile().getEdition() == DescriptorProtos.Edition.EDITION_PROTO2 || getFile().getEdition() == DescriptorProtos.Edition.EDITION_PROTO3)) {
                getFile().resolveAllFeaturesImmutable();
            }
            if (this.features != null) {
                return this.features;
            }
            throw new NullPointerException(a.j("Features not yet loaded for ", getFullName(), "."));
        }

        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public boolean hasInferredLegacyProtoFeatures() {
            return false;
        }

        public DescriptorProtos.FeatureSet inferLegacyProtoFeatures() {
            return DescriptorProtos.FeatureSet.getDefaultInstance();
        }

        public void resolveFeatures(DescriptorProtos.FeatureSet featureSet) throws DescriptorValidationException {
            if (this.parent != null && featureSet.equals(DescriptorProtos.FeatureSet.getDefaultInstance()) && !hasInferredLegacyProtoFeatures()) {
                this.features = this.parent.features;
                validateFeatures();
                return;
            }
            boolean z = false;
            boolean z2 = false;
            for (FieldDescriptor fieldDescriptor : featureSet.getExtensionFields().keySet()) {
                int number = fieldDescriptor.getNumber();
                GeneratedMessage.GeneratedExtension<DescriptorProtos.FeatureSet, JavaFeaturesProto.JavaFeatures> generatedExtension = JavaFeaturesProto.java_;
                if (number == generatedExtension.getNumber() && fieldDescriptor != generatedExtension.getDescriptor()) {
                    z2 = true;
                }
            }
            if (!featureSet.getUnknownFields().isEmpty() && featureSet.getUnknownFields().hasField(JavaFeaturesProto.java_.getNumber())) {
                z = true;
            }
            if (z2 || z) {
                ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
                extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) JavaFeaturesProto.java_);
                try {
                    featureSet = DescriptorProtos.FeatureSet.parseFrom(featureSet.toByteString(), extensionRegistryNewInstance);
                } catch (InvalidProtocolBufferException e) {
                    throw new DescriptorValidationException(this, "Failed to parse features with Java feature extension registry.", e);
                }
            }
            GenericDescriptor genericDescriptor = this.parent;
            DescriptorProtos.FeatureSet.Builder builder = genericDescriptor == null ? Descriptors.getEditionDefaults(getFile().getEdition()).toBuilder() : genericDescriptor.features.toBuilder();
            builder.mergeFrom(inferLegacyProtoFeatures());
            builder.mergeFrom(featureSet);
            this.features = Descriptors.internFeatures(builder.build());
            validateFeatures();
        }

        public abstract Message toProto();

        public void validateFeatures() {
        }
    }

    public final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private volatile DescriptorProtos.MethodOptions options;
        private Descriptor outputType;
        private DescriptorProtos.MethodDescriptorProto proto;
        private final ServiceDescriptor service;

        private MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i) throws DescriptorValidationException {
            super();
            this.parent = serviceDescriptor;
            this.index = i;
            this.proto = methodDescriptorProto;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            this.fullName = serviceDescriptor.getFullName() + '.' + methodDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            DescriptorPool descriptorPool = getFile().pool;
            String inputType = this.proto.getInputType();
            DescriptorPool.SearchFilter searchFilter = DescriptorPool.SearchFilter.TYPES_ONLY;
            GenericDescriptor genericDescriptorLookupSymbol = descriptorPool.lookupSymbol(inputType, this, searchFilter);
            if (!(genericDescriptorLookupSymbol instanceof Descriptor)) {
                throw new DescriptorValidationException(this, "\"" + this.proto.getInputType() + "\" is not a message type.");
            }
            this.inputType = (Descriptor) genericDescriptorLookupSymbol;
            GenericDescriptor genericDescriptorLookupSymbol2 = getFile().pool.lookupSymbol(this.proto.getOutputType(), this, searchFilter);
            if (genericDescriptorLookupSymbol2 instanceof Descriptor) {
                this.outputType = (Descriptor) genericDescriptorLookupSymbol2;
                return;
            }
            throw new DescriptorValidationException(this, "\"" + this.proto.getOutputType() + "\" is not a message type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.MethodDescriptorProto methodDescriptorProto) throws DescriptorValidationException {
            this.proto = methodDescriptorProto;
            this.options = null;
            resolveFeatures(methodDescriptorProto.getOptions().getFeatures());
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public Descriptor getInputType() {
            return this.inputType;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.MethodOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.MethodOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public Descriptor getOutputType() {
            return this.outputType;
        }

        public ServiceDescriptor getService() {
            return this.service;
        }

        public boolean isClientStreaming() {
            return this.proto.getClientStreaming();
        }

        public boolean isServerStreaming() {
            return this.proto.getServerStreaming();
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.MethodDescriptorProto toProto() {
            return this.proto;
        }
    }

    interface NumberGetter<T> {
        int getNumber(T t);
    }

    public final class OneofDescriptor extends GenericDescriptor {
        private Descriptor containingType;
        private int fieldCount;
        private FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private volatile DescriptorProtos.OneofOptions options;
        private DescriptorProtos.OneofDescriptorProto proto;

        private OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) {
            super();
            this.parent = descriptor;
            this.proto = oneofDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, oneofDescriptorProto.getName());
            this.file = fileDescriptor;
            this.index = i;
            this.containingType = descriptor;
            this.fieldCount = 0;
        }

        public static /* synthetic */ int access$2908(OneofDescriptor oneofDescriptor) {
            int i = oneofDescriptor.fieldCount;
            oneofDescriptor.fieldCount = i + 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) throws DescriptorValidationException {
            this.proto = oneofDescriptorProto;
            this.options = null;
            resolveFeatures(oneofDescriptorProto.getOptions().getFeatures());
        }

        public Descriptor getContainingType() {
            return this.containingType;
        }

        public FieldDescriptor getField(int i) {
            return this.fields[i];
        }

        public int getFieldCount() {
            return this.fieldCount;
        }

        public List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.OneofOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.OneofOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        public boolean isSynthetic() {
            FieldDescriptor[] fieldDescriptorArr = this.fields;
            return fieldDescriptorArr.length == 1 && fieldDescriptorArr[0].isProto3Optional;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.OneofDescriptorProto toProto() {
            return this.proto;
        }
    }

    public final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private volatile DescriptorProtos.ServiceOptions options;
        private DescriptorProtos.ServiceDescriptorProto proto;

        private ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i) throws DescriptorValidationException {
            super();
            this.parent = fileDescriptor;
            this.index = i;
            this.proto = serviceDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, serviceDescriptorProto.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[serviceDescriptorProto.getMethodCount()];
            for (int i2 = 0; i2 < serviceDescriptorProto.getMethodCount(); i2++) {
                this.methods[i2] = new MethodDescriptor(serviceDescriptorProto.getMethod(i2), fileDescriptor, this, i2);
            }
            fileDescriptor.pool.addSymbol(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void crossLink() throws DescriptorValidationException {
            for (MethodDescriptor methodDescriptor : this.methods) {
                methodDescriptor.crossLink();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resolveAllFeatures() throws DescriptorValidationException {
            resolveFeatures(this.proto.getOptions().getFeatures());
            for (MethodDescriptor methodDescriptor : this.methods) {
                methodDescriptor.resolveAllFeatures();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) throws DescriptorValidationException {
            this.proto = serviceDescriptorProto;
            this.options = null;
            resolveFeatures(serviceDescriptorProto.getOptions().getFeatures());
            int i = 0;
            while (true) {
                MethodDescriptor[] methodDescriptorArr = this.methods;
                if (i >= methodDescriptorArr.length) {
                    return;
                }
                methodDescriptorArr[i].setProto(serviceDescriptorProto.getMethod(i));
                i++;
            }
        }

        public MethodDescriptor findMethodByName(String str) {
            GenericDescriptor genericDescriptorFindSymbol = this.file.pool.findSymbol(this.fullName + '.' + str);
            if (genericDescriptorFindSymbol instanceof MethodDescriptor) {
                return (MethodDescriptor) genericDescriptorFindSymbol;
            }
            return null;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public FileDescriptor getFile() {
            return this.file;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getFullName() {
            return this.fullName;
        }

        public int getIndex() {
            return this.index;
        }

        public List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public String getName() {
            return this.proto.getName();
        }

        public DescriptorProtos.ServiceOptions getOptions() {
            if (this.options == null) {
                DescriptorProtos.ServiceOptions options = this.proto.getOptions();
                if (options.hasFeatures()) {
                    options = options.toBuilder().clearFeatures().build();
                }
                synchronized (this) {
                    try {
                        if (this.options == null) {
                            this.options = options;
                        }
                    } finally {
                    }
                }
            }
            return this.options;
        }

        @Override // com.google.protobuf.Descriptors.GenericDescriptor
        public DescriptorProtos.ServiceDescriptorProto toProto() {
            return this.proto;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T binarySearch(T[] tArr, int i, NumberGetter<T> numberGetter, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            T t = tArr[i5];
            int number = numberGetter.getNumber(t);
            if (i2 < number) {
                i3 = i5 - 1;
            } else {
                if (i2 <= number) {
                    return t;
                }
                i4 = i5 + 1;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            return descriptor.getFullName() + '.' + str;
        }
        String str2 = fileDescriptor.getPackage();
        if (str2.isEmpty()) {
            return str;
        }
        return str2 + '.' + str;
    }

    public static DescriptorProtos.FeatureSet getEditionDefaults(DescriptorProtos.Edition edition) {
        DescriptorProtos.FeatureSetDefaults javaEditionDefaults2 = getJavaEditionDefaults();
        if (edition.getNumber() < javaEditionDefaults2.getMinimumEdition().getNumber()) {
            throw new IllegalArgumentException("Edition " + edition + " is lower than the minimum supported edition " + javaEditionDefaults2.getMinimumEdition() + "!");
        }
        if (edition.getNumber() > javaEditionDefaults2.getMaximumEdition().getNumber()) {
            throw new IllegalArgumentException("Edition " + edition + " is greater than the maximum supported edition " + javaEditionDefaults2.getMaximumEdition() + "!");
        }
        DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault = null;
        for (DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault2 : javaEditionDefaults2.getDefaultsList()) {
            if (featureSetEditionDefault2.getEdition().getNumber() > edition.getNumber()) {
                break;
            }
            featureSetEditionDefault = featureSetEditionDefault2;
        }
        if (featureSetEditionDefault != null) {
            return featureSetEditionDefault.getFixedFeatures().toBuilder().mergeFrom(featureSetEditionDefault.getOverridableFeatures()).build();
        }
        throw new IllegalArgumentException("Edition " + edition + " does not have a valid default FeatureSet!");
    }

    public static DescriptorProtos.FeatureSetDefaults getJavaEditionDefaults() {
        DescriptorProtos.FeatureSetDefaults.getDescriptor();
        JavaFeaturesProto.getDescriptor();
        if (javaEditionDefaults == null) {
            synchronized (Descriptors.class) {
                if (javaEditionDefaults == null) {
                    try {
                        ExtensionRegistry extensionRegistryNewInstance = ExtensionRegistry.newInstance();
                        extensionRegistryNewInstance.add((GeneratedMessage.GeneratedExtension<?, ?>) JavaFeaturesProto.java_);
                        setTestJavaEditionDefaults(DescriptorProtos.FeatureSetDefaults.parseFrom(JavaEditionDefaults.PROTOBUF_INTERNAL_JAVA_EDITION_DEFAULTS.getBytes(Internal.ISO_8859_1), extensionRegistryNewInstance));
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        return javaEditionDefaults;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DescriptorProtos.FeatureSet internFeatures(DescriptorProtos.FeatureSet featureSet) {
        DescriptorProtos.FeatureSet featureSetPutIfAbsent = FEATURE_CACHE.putIfAbsent(Integer.valueOf(featureSet.hashCode()), featureSet);
        return featureSetPutIfAbsent == null ? featureSet : featureSetPutIfAbsent;
    }

    public static void setTestJavaEditionDefaults(DescriptorProtos.FeatureSetDefaults featureSetDefaults) {
        javaEditionDefaults = featureSetDefaults;
    }
}
