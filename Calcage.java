import java.util.Calendar;

public class Calcage {
	public static void main( String[] args ) {
		// 変数の宣言
		int year_birth;	// 誕生日の西暦年
		int month_birth;// 誕生日の月
		int day_birth;	// 誕生日の日

		// 入力した引数が３つ以上かを調べる
		if ( 3 >args.length ) {
			// 入力した引数が３つ未満の場合、使用方法を表示する
			System.out.println( "CalcAge [西暦年]  [月]  [日]" );
			return;
		}

		// 引数をint型に変換し、年/月/日に代入
		try {
			// args[0],args[1],args[2]を数値に変換
			year_birth  = Integer.parseInt( args[ 0 ] );
			month_birth = Integer.parseInt( args[ 1 ] );
			day_birth   = Integer.parseInt( args[ 2 ] );
		}
		catch( NumberFormatException ne )
		{
			// args[0],args[1],args[2]のどれかが数字ではない
			System.out.println( "生年月日の取得に失敗しました" );
			return;
		}

		// 誕生日の数値チェック
		if ( 0 > year_birth ) {
			System.out.println( "西暦年に0以上を指定してください" );
			return;
		}
		if ( ( 1 > month_birth ) || ( 12 < month_birth ) ) {
			System.out.println( "月に1～12を指定してください" );
			return;
		}
		if ( ( 1 > day_birth ) || ( 31 < day_birth ) ) {
			System.out.println( "日に1～31を指定してください" );
			return;
		}

		// 変数の宣言
		int year_today;		// 現在の西暦年
		int month_today;	// 現在の月
		int day_today;		// 現在の日

		// 今日の生年月日を変数に代入
		Calendar calendar = Calendar.getInstance();
		year_today  = calendar.get( Calendar.YEAR );
		month_today = calendar.get( Calendar.MONTH ) + 1;
		day_today   = calendar.get( Calendar.DAY_OF_MONTH );

		// 変数の宣言
		int age;	// 計算する年齢

		// 年齢の計算
		// 西暦年の差をageに代入
		age = year_today - year_birth;
		// まだ誕生月になっていなければ
		if ( month_today < month_birth )
			-- age;	// １年引く
		else {
			// まだ誕生月日になっていなければ
			if ( month_today == month_birth ) {
				if ( day_birth < day_today )
					-- age;	// １年引く
			}
		}

		// 計算結果を表示
		System.out.println( "誕生日" + " "
			 + year + "年" + month + "月" + day + "日" );
		System.out.println( "今日" + "   "
			+ year_today + "年" + month_today + "月" + day_today + "日" );
		System.out.println();
		System.out.println( age + "歳です" );
	}
}