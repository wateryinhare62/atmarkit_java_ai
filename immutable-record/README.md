# immutable-record

このプロジェクトは Java の `record` を使って実装した不変オブジェクトのサンプルを含みます。

内容:
- `PersonRecord` : `record` による不変データクラス（フィールドは暗黙的に final、アクセサは自動生成）。
- `App` : `PersonRecord` の生成と利用例（アクセサの利用、メソッドの追加、Map のキー利用）を示す実行サンプル。

実行方法（PowerShell の例、Java 16+推奨）:

```powershell
javac .\immutable-record\src\PersonRecord.java .\immutable-record\src\App.java
java -cp .\immutable-record\src App
```
