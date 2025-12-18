# immutable-classic

このプロジェクトは「クラシックな方法」で実装した不変オブジェクトのサンプルを含みます。

内容:
- `Person` クラス: `final` クラス、`private final` フィールド、コンストラクタで初期化、防御的コピー（`Date`）を実装。
- `App` クラス: `Person` を生成して内部状態が外部から変更されないことを示す実行サンプル。

実行方法（PowerShell の例）:

```powershell
javac .\immutable-classic\src\Person.java .\immutable-classic\src\App.java
java -cp .\immutable-classic\src App
```
