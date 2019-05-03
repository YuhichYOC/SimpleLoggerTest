### SessionLogger by Yuichi Yoshii is licensed under the Apache License, Version2.0  
  
log4j2 の使い方・すぐ忘れるのでノートとっておく  
  
備忘録  
1. IntelliJ では WEB-INF をリソースルートディレクトリとしてマークしないとデバッグ時に log4j2.xml を読み込んでくれない  
2. RollingFile のファイル名指定に日付 ( -%d{yyyyMMdd}, {date:yyyyMMdd} ) が使えない。使うと ERROR Unable to invoke factory method in class org.apache.logging.log4j.core.appender.RollingFileAppender って文句言ってくる  
3. RollingFile のバックアップ？ファイル ( filePattern 属性 ) には日付が使用できる  
4. ンンッ… マ゜ッ！ア゛ッ！↑  **ああああああああ使いにくいあああああああ！！！**  
  
できること  
log4j2 ラッパーのメソッドごとに別のログファイルへの書き込みができる  
  
やり方  
1. 以下の方法で使用するロガーを切り替えることにより、別ファイルへの書き込みを行う  
2. log4j2.xml の Logger 要素で複数のロガーを定義、name 属性で切り分けを行う  
3. log4j2.xml の Appenders 要素に定義した分のアペンダーを定義、ロガー⇔アペンダーの紐づけはロガー定義の子要素 AppenderRef で行う  
4. LogManager.getLogger の引数に使用したいロガーの名前を渡すと log4j2.xml で定義したロガーを取得できるので後はいつもの使い方をする  
