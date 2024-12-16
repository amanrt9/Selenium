package dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class PrintDate {

	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		
		SimpleDateFormat sformat=new SimpleDateFormat("dd/MM/YY HH:mm:ss");
		Date d=new Date();
		System.out.println(sformat.format(d));
	}

}
