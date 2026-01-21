exception-finally プロジェクト

`finally` を使ってリソース解放を保証するチェック例外のサンプル。

ビルドと実行:

```powershell
javac -d out exception-finally/src/*.java
java -cp out App
```

ファイル:
- src/ManualResource.java
- src/FileService.java
- src/App.java

説明: `FileService#process()` は `ManualResource` を生成し、処理中に `IOException` を投げるが、`finally` で必ず `close()` を呼んでリソースを解放することを示す。
