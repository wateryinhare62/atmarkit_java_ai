
# package プロジェクト

このプロジェクトは com.example.app パッケージに Main クラスを配置するサンプルです。

非モジュール版ビルド/実行（従来方式、PowerShell）:

```powershell
javac package/src/com/example/anotherapp/Another.java package/src/com/example/app/Main.java -d package/bin
java -cp package/bin com.example.app.Main
```

モジュール版ビルド/実行（Java 9+、PowerShell の例）:

```powershell
# コンパイル
javac --module-source-path package/src -d package/bin package/src/module-info.java package/src/com/example/anotherapp/Another.java package/src/com/example/app/Main.java

# 実行
java --module-path package/bin --module com.example.appmodule/com.example.app.Main
```

Bash（UNIX系）での例:

```bash
javac --module-source-path package/src -d package/bin package/src/module-info.java package/src/com/example/anotherapp/Another.java package/src/com/example/app/Main.java
java --module-path package/bin --module com.example.appmodule/com.example.app.Main
```
