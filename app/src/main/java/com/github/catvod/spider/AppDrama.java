.class public Lcom/github/catvod/spider/AppDrama;
.super Lcom/github/catvod/crawler/Spider;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public e:Lorg/json/JSONObject;

.field public f:Ljava/lang/String;

.field public final f:[Ljava/lang/String;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 4

    invoke-direct {p0}, Lcom/github/catvod/crawler/Spider;-><init>()V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/github/catvod/spider/AppDrama;->e:Lorg/json/JSONObject;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    const-string v0, "AES/ECB/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const-string v1, "AES"

    invoke-direct {v2, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 p1, 0x2

    invoke-virtual {v0, p1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    new-instance p1, Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AES/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    const-string v2, "/PKCS7Padding"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    const-string v6, "AES"

    invoke-direct {v2, p1, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 p1, 0x0

    const/4 v7, 0x1

    const-string v6, "CBC"

    invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3d

    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    invoke-virtual {p3}, Ljava/lang/String;->getBytes()[B

    move-result-object p3

    invoke-direct {v6, p3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    invoke-virtual {v0, v7, v2, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    goto :goto_40

    :cond_3d
    invoke-virtual {v0, v7, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    :goto_40
    sget-object p3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    const-string p3, "CBC"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_74

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    array-length p3, p0

    :goto_58
    if-ge p1, p3, :cond_6f

    aget-byte v0, p0, p1

    const-string v2, "%02x"

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr p1, v7

    goto :goto_58

    :cond_6f
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_74
    invoke-static {p0, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(I)Ljava/lang/String;
    .registers 9

    const/4 v0, 0x1

    const-string v1, "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    move v6, v5

    :goto_f
    add-int/lit8 v7, p0, -0x1

    if-ge v6, v7, :cond_24

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v3, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v6, v0

    goto :goto_f

    :cond_24
    const-string p0, "="

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h([B)Ljava/util/ArrayList;
    .registers 7

    invoke-static {p0}, Lcom/base/model/proto/ApiResultProto$ApiResult;->parseFrom([B)Lcom/base/model/proto/ApiResultProto$ApiResult;

    move-result-object p0

    invoke-virtual {p0}, Lcom/base/model/proto/ApiResultProto$ApiResult;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p0

    invoke-static {p0}, Lcom/base/model/proto/DramaProto$DramaBeanPage;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/base/model/proto/DramaProto$DramaBeanPage;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/base/model/proto/DramaProto$DramaBeanPage;->getDramaBeanList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/base/model/proto/DramaProto$DramaBean;

    new-instance v2, Lcom/github/catvod/spider/merge/c/e;

    invoke-virtual {v1}, Lcom/base/model/proto/DramaProto$DramaBean;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/base/model/proto/DramaProto$DramaBean;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/base/model/proto/DramaProto$DramaBean;->getCoverImage()Lcom/base/model/proto/DramaCoverImageProto$DramaCoverImageBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/base/model/proto/DramaCoverImageProto$DramaCoverImageBean;->getThumbnailPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/base/model/proto/DramaProto$DramaBean;->getRemark()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Lcom/github/catvod/spider/merge/c/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_46
    return-object v0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, p1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    const-string p1, "RSA"

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    const-string v0, "RSA/ECB/PKCS1Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c()Ljava/util/HashMap;
    .registers 15

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/github/catvod/spider/AppDrama;->d:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, p0, Lcom/github/catvod/spider/AppDrama;->b:Ljava/lang/String;

    goto :goto_f

    :cond_d
    iget-object v5, p0, Lcom/github/catvod/spider/AppDrama;->d:Ljava/lang/String;

    :goto_f
    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->d()Lorg/json/JSONObject;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const/16 v9, 0x10

    invoke-static {v9}, Lcom/github/catvod/spider/AppDrama;->f(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, "vApp"

    const-string v11, "3019"

    invoke-virtual {v6, v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lcom/github/catvod/spider/AppDrama;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v11, p0, Lcom/github/catvod/spider/AppDrama;->f:[Ljava/lang/String;

    const/4 v12, 0x1

    aget-object v11, v11, v12

    const-string v12, "ECB"

    const/4 v13, 0x0

    invoke-static {v10, v11, v12, v13}, Lcom/github/catvod/spider/AppDrama;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "sig"

    invoke-virtual {v6, v11, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "random_str"

    invoke-virtual {v6, v5, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "timestamp"

    invoke-virtual {v6, v5, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v5, "sig2"

    const/4 v7, 0x0

    invoke-virtual {v10, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "sig3"

    invoke-virtual {v10, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, "CBC"

    iget-object v5, p0, Lcom/github/catvod/spider/AppDrama;->c:Ljava/lang/String;

    invoke-static {v2, v5, v0, v5}, Lcom/github/catvod/spider/AppDrama;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "paramsData"

    invoke-virtual {v2, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "User-Agent"

    const-string v3, "okhttp/3.12.1"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Accept"

    const-string v3, "application/x-protobuf"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "Content-Type"

    const-string v3, "application/x-protobuf"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "publicParams"

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public categoryContent(Ljava/lang/String;Ljava/lang/String;ZLjava/util/HashMap;)Ljava/lang/String;
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    const-string v1, "pagesize"

    const-string v2, "21"

    invoke-virtual {p3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "typeId1"

    invoke-virtual {p3, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "page"

    invoke-virtual {p3, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "vodOrderBy"

    const-string v3, "extend_sort"

    const-string v4, "最新"

    invoke-virtual {p4, v3, v4}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "vodArea"

    const-string v3, "area"

    const-string v4, ""

    invoke-virtual {p4, v3, v4}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "vodLang"

    const-string v3, "lang"

    invoke-virtual {p4, v3, v4}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "vodClass"

    const-string v3, "class"

    invoke-virtual {p4, v3, v4}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p3, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "vodYear"

    const-string p1, "year"

    invoke-virtual {p4, p1, v4}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p3, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p3}, Lcom/github/catvod/spider/AppDrama;->g(Ljava/util/HashMap;)[B

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p4, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "/api/proto/v5/drama/category"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->c()Ljava/util/HashMap;

    move-result-object p4

    invoke-static {p3, p1, p4}, Lcom/github/catvod/spider/merge/k/b;->b(Ljava/lang/String;[BLjava/util/HashMap;)Lcom/github/catvod/spider/merge/A/u;

    move-result-object p1

    new-instance p3, Lcom/github/catvod/spider/merge/c/c;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lcom/github/catvod/spider/merge/A/u;->a:[B

    invoke-static {p1}, Lcom/github/catvod/spider/AppDrama;->h([B)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/github/catvod/spider/merge/c/c;->z(Ljava/util/List;)V

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/github/catvod/spider/merge/c/c;->b(I)V

    invoke-virtual {p3}, Lcom/github/catvod/spider/merge/c/c;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d()Lorg/json/JSONObject;
    .registers 16

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v5, 0x0

    const-string v3, "-"

    const-string v7, ""

    invoke-virtual {v1, v3, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    const-string v8, "country"

    const-string v9, "CN"

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v9, "vName"

    iget-object v11, p0, Lcom/github/catvod/spider/AppDrama;->e:Lorg/json/JSONObject;

    const-string v12, "version"

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v9, "cpuId"

    const-string v11, "MT6893Z%2FCZA"

    invoke-virtual {v0, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v9, "young"

    invoke-virtual {v0, v9, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v9, "facturer"

    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "pkg"

    iget-object v12, p0, Lcom/github/catvod/spider/AppDrama;->e:Ljava/lang/String;

    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "uuid"

    invoke-virtual {v0, v11, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "resolution"

    const-string v12, "1080x2272"

    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "mac"

    const-string v12, "02%3A00%3A00%3A00%3A00%3A00"

    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "abid"

    const-string v12, "397"

    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "model"

    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "plat"

    const-string v12, "android"

    invoke-virtual {v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v11, "udid"

    invoke-virtual {v0, v11, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "dpi"

    const-string v11, "440"

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "net"

    const-string v11, "1"

    invoke-virtual {v0, v1, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "lang"

    const-string v4, "zh"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "brand"

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "density"

    const-string v4, "2.75"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "appName"

    iget-object v4, p0, Lcom/github/catvod/spider/AppDrama;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "cpu"

    const-string v4, "arm64-v8a"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "chid"

    const-string v4, "10000"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "carrier"

    const-string v4, "%E8%81%94%E9%80%9A"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "_vOsCode"

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "vOs"

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "v"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "tenantId"

    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "vApp"

    iget-object v4, p0, Lcom/github/catvod/spider/AppDrama;->e:Lorg/json/JSONObject;

    const-string v3, "version"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v2, "."

    invoke-virtual {v3, v2, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "device"

    invoke-virtual {v0, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "androidID"

    invoke-static {}, Lcom/github/catvod/spider/Init;->context()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v3, "android_id"

    invoke-static {v2, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public detailContent(Ljava/util/List;)Ljava/lang/String;
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x2

    const-string v3, "id"

    const/4 v5, 0x0

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lcom/github/catvod/spider/AppDrama;->g(Ljava/util/HashMap;)[B

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "/api/proto/v5/drama/getDetail"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->c()Ljava/util/HashMap;

    move-result-object v7

    invoke-static {v1, p1, v7}, Lcom/github/catvod/spider/merge/k/b;->b(Ljava/lang/String;[BLjava/util/HashMap;)Lcom/github/catvod/spider/merge/A/u;

    move-result-object p1

    iget-object p1, p1, Lcom/github/catvod/spider/merge/A/u;->a:[B

    invoke-static {p1}, Lcom/base/model/proto/ApiResultProto$ApiResult;->parseFrom([B)Lcom/base/model/proto/ApiResultProto$ApiResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/base/model/proto/ApiResultProto$ApiResult;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p1

    invoke-static {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;

    move-result-object p1

    new-instance v1, Lcom/github/catvod/spider/merge/c/e;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getActor()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->f(Ljava/lang/String;)V

    const-string v7, ""

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->i(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getTag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->p(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getArea()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->g(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getYear()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->q(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getRemark()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->o(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getIntro()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/github/catvod/spider/merge/c/e;->h(Ljava/lang/String;)V

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Lcom/base/model/proto/DramaDetailProto$DramaDetailBean;->getVideosList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_84
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/base/model/proto/DramaVideoProto$DramaVideoBean;

    invoke-virtual {v8}, Lcom/base/model/proto/DramaVideoProto$DramaVideoBean;->getSourceCn()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_9c

    const-string v9, "橘汁"

    :cond_9c
    invoke-interface {v7, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_aa

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_aa
    invoke-virtual {v8}, Lcom/base/model/proto/DramaVideoProto$DramaVideoBean;->getPath()Ljava/lang/String;

    move-result-object v10

    const-string v11, "(?i).*\\.(mp4|m3u8|flv|mkv|avi|ts|mov|mpd|m4a|wmv)(\\?.*)?$"

    invoke-virtual {v10, v11}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_b7

    goto :goto_d6

    :cond_b7
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    const-string v12, "vodPlayFrom"

    invoke-virtual {v8}, Lcom/base/model/proto/DramaVideoProto$DramaVideoBean;->getSource()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v12, "playUrl"

    invoke-virtual {v11, v12, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->getBytes()[B

    move-result-object v10

    invoke-static {v10, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v10

    :goto_d6
    invoke-virtual {v7, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Lcom/base/model/proto/DramaVideoProto$DramaVideoBean;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "$"

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_84

    :cond_f9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_130

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v8, "#"

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v8, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10b

    :cond_130
    const-string v0, "$$$"

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/github/catvod/spider/merge/c/e;->m(Ljava/lang/String;)V

    const-string p1, "$$$"

    invoke-static {p1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/github/catvod/spider/merge/c/e;->n(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/github/catvod/spider/merge/c/c;->m(Lcom/github/catvod/spider/merge/c/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/util/HashMap;
    .registers 7

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->d()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CBC"

    iget-object v3, p0, Lcom/github/catvod/spider/AppDrama;->c:Ljava/lang/String;

    invoke-static {v0, v3, v1, v3}, Lcom/github/catvod/spider/AppDrama;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "paramsData"

    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v3, "User-Agent"

    const-string v4, "okhttp/3.12.1"

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "Accept"

    const-string v4, "application/json"

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "Content-Type"

    const-string v4, "application/json; charset=utf-8"

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "publicParams"

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final g(Ljava/util/HashMap;)[B
    .registers 16

    const/4 v1, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/16 v4, 0x8

    invoke-static {v4}, Lcom/github/catvod/spider/AppDrama;->f(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x14

    invoke-static {v6}, Lcom/github/catvod/spider/AppDrama;->f(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1e
    :goto_1e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_50

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {p1, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_1e

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_39

    goto :goto_1e

    :cond_39
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v12

    if-lez v12, :cond_44

    const-string v12, "&"

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_44
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "="

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1e

    :cond_50
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/github/catvod/spider/AppDrama;->f:[Ljava/lang/String;

    aget-object v0, v0, v1

    const-string v4, "ECB"

    const/4 v8, 0x0

    invoke-static {p1, v0, v4, v8}, Lcom/github/catvod/spider/AppDrama;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/base/model/proto/SecureRequestProto$SecureRequest;->newBuilder()Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;

    move-result-object v0

    invoke-virtual {p1, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;->setAesEncrypt1(Ljava/lang/String;)Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;

    move-result-object v0

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;->setAesEncrypt2(Ljava/lang/String;)Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v7}, Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;->setAesFakestr(Ljava/lang/String;)Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;->setTimestamp(J)Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v5}, Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;->setRandomStr(Ljava/lang/String;)Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/base/model/proto/SecureRequestProto$SecureRequest$Builder;->build()Lcom/base/model/proto/SecureRequestProto$SecureRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method

.method public homeContent(Z)Ljava/lang/String;
    .registers 21

    const/4 v0, 0x1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, p0

    iget-object v5, v4, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, 0x0

    const/16 v9, 0x8

    const-string v8, "/api/v3/drama/getCategory?orderBy=type_id"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/github/catvod/spider/AppDrama;->e()Ljava/util/HashMap;

    move-result-object v8

    invoke-static {v3, v8}, Lcom/github/catvod/spider/merge/k/b;->l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v10, "data"

    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    if-eqz v8, :cond_fa

    const-string v10, "class"

    const-string v12, "lang"

    const-string v13, "area"

    const-string v14, "year"

    const-string v5, "extend_sort"

    filled-new-array {v10, v12, v13, v14, v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move v10, v7

    :goto_4b
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-ge v10, v12, :cond_fa

    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    const-string v13, "name"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "公告"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_65

    :goto_63
    goto/16 :goto_f4

    :cond_65
    const-string v13, "id"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "name"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Lcom/github/catvod/spider/merge/c/a;

    invoke-direct {v15, v13, v14}, Lcom/github/catvod/spider/merge/c/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v14, "converUrl"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_86

    goto :goto_63

    :cond_86
    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_94
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_ea

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v14, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v16

    if-eqz v16, :cond_e5

    invoke-virtual {v14, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v17

    if-eqz v17, :cond_b3

    goto :goto_94

    :cond_b3
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-array v4, v0, [B

    const/16 v18, 0x7c

    aput-byte v18, v4, v7

    new-array v7, v9, [B

    fill-array-data v7, :array_100

    invoke-static {v4, v7}, Lcom/github/catvod/spider/merge/A/a;->a([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v6, v4

    const/4 v7, 0x0

    :goto_cd
    if-ge v7, v6, :cond_dc

    aget-object v9, v4, v7

    new-instance v0, Lcom/github/catvod/spider/merge/c/b$a;

    invoke-direct {v0, v9, v9}, Lcom/github/catvod/spider/merge/c/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    add-int/2addr v7, v0

    goto :goto_cd

    :cond_dc
    new-instance v0, Lcom/github/catvod/spider/merge/c/b;

    invoke-direct {v0, v3, v3, v11}, Lcom/github/catvod/spider/merge/c/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e5

    :cond_e5
    :goto_e5
    const/4 v0, 0x1

    const/4 v7, 0x0

    const/16 v9, 0x8

    goto :goto_94

    :cond_ea
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_f3

    invoke-virtual {v2, v13, v12}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f3
    const/4 v0, 0x1

    :goto_f4
    add-int/2addr v10, v0

    const/4 v7, 0x0

    const/16 v9, 0x8

    goto/16 :goto_4b

    :cond_fa
    invoke-static {v1, v2}, Lcom/github/catvod/spider/merge/c/c;->o(Ljava/util/List;Ljava/util/LinkedHashMap;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :array_100
    .array-data 1
        0x50t
        -0x6ft
        0x7t
        0x6bt
        -0x32t
        -0x4et
        0x5t
        -0x7bt
    .end array-data
.end method

.method public homeVideoContent()Ljava/lang/String;
    .registers 19

    move-object/from16 v0, p0

    const/4 v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/api/ex/v3/security/tag/list"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/github/catvod/spider/AppDrama;->e()Ljava/util/HashMap;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/github/catvod/spider/merge/k/b;->l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v5, "data"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_39

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Lcom/github/catvod/spider/merge/c/c;->i(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_39
    iget-object v15, v0, Lcom/github/catvod/spider/AppDrama;->g:Ljava/lang/String;

    const/4 v6, 0x0

    const-string v16, "0"

    invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_54

    iget-object v5, v0, Lcom/github/catvod/spider/AppDrama;->f:[Ljava/lang/String;

    const/4 v6, 0x0

    aget-object v7, v5, v6

    invoke-static {v3, v7}, Lcom/github/catvod/spider/AppDrama;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aget-object v5, v5, v1

    invoke-static {v3, v5}, Lcom/github/catvod/spider/AppDrama;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_54

    :cond_54
    :goto_54
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move v3, v6

    :goto_5f
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v3, v8, :cond_c3

    invoke-virtual {v7, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    const-string v9, "sections"

    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    if-nez v8, :cond_73

    goto/16 :goto_bf

    :cond_73
    move v9, v6

    :goto_74
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v10

    if-ge v9, v10, :cond_bf

    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    const-string v11, "vodList"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    if-nez v10, :cond_87

    goto :goto_bb

    :cond_87
    move v11, v6

    :goto_88
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v12

    if-ge v11, v12, :cond_bb

    invoke-virtual {v10, v11}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    new-instance v13, Lcom/github/catvod/spider/merge/c/e;

    const-string v14, "id"

    invoke-virtual {v12, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v6, "name"

    invoke-virtual {v12, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "coverImage"

    invoke-virtual {v12, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "remark"

    invoke-virtual {v12, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v13, v14, v6, v1, v2}, Lcom/github/catvod/spider/merge/c/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    add-int/2addr v11, v1

    goto :goto_88

    :cond_bb
    :goto_bb
    add-int/2addr v9, v1

    const/4 v6, 0x0

    goto/16 :goto_74

    :cond_bf
    :goto_bf
    add-int/2addr v3, v1

    const/4 v6, 0x0

    goto/16 :goto_5f

    :cond_c3
    invoke-static {v5}, Lcom/github/catvod/spider/merge/c/c;->i(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public init(Landroid/content/Context;Ljava/lang/String;)V
    .registers 12

    invoke-super {p0, p1, p2}, Lcom/github/catvod/crawler/Spider;->init(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/github/catvod/spider/AppDrama;->e:Lorg/json/JSONObject;

    const-string v1, "host"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    const-string v1, "publicKey"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->b:Ljava/lang/String;

    const-string v1, "ed5fdsgucxumegqa"

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->c:Ljava/lang/String;

    const-string v1, ""

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->d:Ljava/lang/String;

    const-string v1, "pkg"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->e:Ljava/lang/String;

    const-string v1, "appName"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->f:Ljava/lang/String;

    const-string v1, "decrypt"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->g:Ljava/lang/String;

    const-string v1, "dataKey"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "dataIv"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/github/catvod/spider/AppDrama;->f:[Ljava/lang/String;

    :try_start_4c
    const-string p2, "site"

    invoke-virtual {v0, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_59

    goto :goto_71

    :cond_59
    new-instance p2, Lorg/json/JSONObject;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/github/catvod/spider/merge/k/b;->l(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "domain"

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_71

    iput-object p1, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;
    :try_end_71
    .catch Ljava/lang/Exception; {:try_start_4c .. :try_end_71} :catch_71

    :catch_71
    :cond_71
    :goto_71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/github/catvod/spider/AppDrama;->f(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/github/catvod/spider/AppDrama;->b:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/github/catvod/spider/AppDrama;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/base/model/proto/RSARequestProto$RSARequest;->newBuilder()Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;

    move-result-object v4

    invoke-virtual {v4, p1, p2}, Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;->setTimestamp(J)Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;->setRandomStr(Ljava/lang/String;)Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;->setSign(Ljava/lang/String;)Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;

    move-result-object p1

    invoke-static {v0}, Lcom/github/catvod/spider/AppDrama;->f(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;->setFake1(Ljava/lang/String;)Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;

    move-result-object p1

    invoke-static {v0}, Lcom/github/catvod/spider/AppDrama;->f(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;->setFake2(Ljava/lang/String;)Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/base/model/proto/RSARequestProto$RSARequest$Builder;->build()Lcom/base/model/proto/RSARequestProto$RSARequest;

    move-result-object p1

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->c()Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->c()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/api/v5/find/app/zone"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    move-result-object p1

    invoke-static {v0, p1, p2}, Lcom/github/catvod/spider/merge/k/b;->b(Ljava/lang/String;[BLjava/util/HashMap;)Lcom/github/catvod/spider/merge/A/u;

    move-result-object p1

    iget-object p1, p1, Lcom/github/catvod/spider/merge/A/u;->a:[B

    invoke-static {p1}, Lcom/base/model/proto/ApiResultProto$ApiResult;->parseFrom([B)Lcom/base/model/proto/ApiResultProto$ApiResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/base/model/proto/ApiResultProto$ApiResult;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p1

    invoke-static {p1}, Lcom/base/model/proto/RSAPublicProto$RSAPublic;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/base/model/proto/RSAPublicProto$RSAPublic;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/base/model/proto/RSAPublicProto$RSAPublic;->getStr2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/base/model/proto/RSAPublicProto$RSAPublic;->getStr3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/base/model/proto/RSAPublicProto$RSAPublic;->getStr4()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/base/model/proto/RSAPublicProto$RSAPublic;->getStr5()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/github/catvod/spider/AppDrama;->d:Ljava/lang/String;

    return-void
.end method

.method public playerContent(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const/4 p1, 0x0

    const-string p3, "(?i).*\\.(mp4|m3u8|flv|mkv|avi|ts|mov|mpd|m4a|wmv)(\\?.*)?$"

    invoke-virtual {p2, p3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1a

    new-instance p1, Lcom/github/catvod/spider/merge/c/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p2}, Lcom/github/catvod/spider/merge/c/c;->w(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/github/catvod/spider/merge/c/c;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/github/catvod/spider/merge/a/a;->addDanmaku(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1a
    invoke-static {p2, p1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    new-instance p2, Lorg/json/JSONObject;

    new-instance p3, Ljava/lang/String;

    invoke-direct {p3, p1}, Ljava/lang/String;-><init>([B)V

    invoke-direct {p2, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p3

    :goto_31
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_31

    :cond_45
    invoke-virtual {p0, p1}, Lcom/github/catvod/spider/AppDrama;->g(Ljava/util/HashMap;)[B

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/api/proto/v5/videoUsableUrl"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->c()Ljava/util/HashMap;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lcom/github/catvod/spider/merge/k/b;->b(Ljava/lang/String;[BLjava/util/HashMap;)Lcom/github/catvod/spider/merge/A/u;

    move-result-object p1

    iget-object p1, p1, Lcom/github/catvod/spider/merge/A/u;->a:[B

    invoke-static {p1}, Lcom/base/model/proto/ApiResultProto$ApiResult;->parseFrom([B)Lcom/base/model/proto/ApiResultProto$ApiResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/base/model/proto/ApiResultProto$ApiResult;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p1

    invoke-static {p1}, Lcom/base/model/proto/ParsePlayUrlProto$ParsePlayUrlBean;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/base/model/proto/ParsePlayUrlProto$ParsePlayUrlBean;

    move-result-object p1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/base/model/proto/ParsePlayUrlProto$ParsePlayUrlBean;->getHeadersCount()I

    move-result p3

    if-lez p3, :cond_84

    invoke-virtual {p1}, Lcom/base/model/proto/ParsePlayUrlProto$ParsePlayUrlBean;->getHeadersMap()Ljava/util/Map;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    :cond_84
    new-instance p3, Lcom/github/catvod/spider/merge/c/c;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/base/model/proto/ParsePlayUrlProto$ParsePlayUrlBean;->getPlayUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/github/catvod/spider/merge/c/c;->w(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Lcom/github/catvod/spider/merge/c/c;->e(Ljava/util/Map;)V

    invoke-virtual {p3}, Lcom/github/catvod/spider/merge/c/c;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/github/catvod/spider/merge/a/a;->addDanmaku(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public searchContent(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 6

    const-string v0, "1"

    invoke-virtual {p0, p1, p2, v0}, Lcom/github/catvod/spider/AppDrama;->searchContent(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public searchContent(Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    .registers 7

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "searchKeys"

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "page"

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "pagesize"

    const-string p3, "21"

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lcom/github/catvod/spider/AppDrama;->g(Ljava/util/HashMap;)[B

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/github/catvod/spider/AppDrama;->a:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/api/proto/v5/drama/search"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lcom/github/catvod/spider/AppDrama;->c()Ljava/util/HashMap;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lcom/github/catvod/spider/merge/k/b;->b(Ljava/lang/String;[BLjava/util/HashMap;)Lcom/github/catvod/spider/merge/A/u;

    move-result-object p1

    iget-object p1, p1, Lcom/github/catvod/spider/merge/A/u;->a:[B

    invoke-static {p1}, Lcom/github/catvod/spider/AppDrama;->h([B)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/github/catvod/spider/merge/c/c;->i(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
