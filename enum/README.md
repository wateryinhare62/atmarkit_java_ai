# enum

このプロジェクトは列挙型（enum）に振る舞い（メソッドやフィールド）を持たせた簡単なサンプルを含みます。

内容:
- `TrafficLight` 列挙型：各状態に `duration`（秒）を持ち、`canGo()` と `next()` を実装。
- `App.java`：列挙型の振る舞い（次の状態への遷移や判定）を出力して示す実行サンプル。

実行方法（PowerShell の例）:

```powershell
javac .\enum\src\TrafficLight.java .\enum\src\App.java
java -cp .\enum\src App
```
