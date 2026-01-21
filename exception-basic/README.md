exception-basic プロジェクト

既存のチェック例外である `IOException` を使った簡単なサンプル。

ビルドと実行:

```powershell
javac -d out exception-basic/src/*.java
java -cp out App
```

ファイル:
- src/FileReaderService.java
- src/App.java

説明: `FileReaderService#readFile()` は `IOException` を `throws` し、`App` はそれを `try/catch` で捕捉するサンプル。
