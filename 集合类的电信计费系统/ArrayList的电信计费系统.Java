package zuoye_code;
import java.util.*;
import java.io.*;
import java.text.*;
class TelcomUser{
	private String phoneNumber;
	private String callTo;
	private ArrayList communicationRecords;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.communicationRecords = new ArrayList();
	}
	void generateCommunicateRecord() {
		int recordNum = new Random().nextInt(10);
		for(int i=0;i<=recordNum;i++) {
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.HOUR,-new Random().nextInt(10));
			long timeStart = cal.getTimeInMillis();
			long timeEnd = timeStart+60000+new Random().nextInt(600000);
			this.callTo = getCallToPhoneNumber();
			this.communicationRecords.add(this.phoneNumber+","+timeStart+","+timeEnd+","+this.callTo);
		}
	}
	String getCallToPhoneNumber() {
		return "1380372"+new Random().nextInt(3)+new Random().nextInt(3)
				+new Random().nextInt(3)+new Random().nextInt(10);
	}
	String accountFee (long timeStart,long timeEnd) {
		double feePerMinute = 0.2;
		int minute = Math.round(((timeEnd-timeStart)/60000));
		double feeTotal = feePerMinute*minute;
		return String.format("%.4f",feeTotal);
	}
	void printDetails() {
		int arrayListSize = this.communicationRecords.size();
		for(int i=0;i<arrayListSize-1;i++) {
			System.out.println("-----------通话记录分割线-------------");
			String[] recordField = ((String)this.communicationRecords.get(i)).split(",");
		    System.out.println("主叫："+recordField[0]);
		    System.out.println("被叫："+recordField[3]);
		    System.out.println("通话开始时间："+new Date(Long.parseLong(recordField[1])));
		    System.out.println("通话结束时间："+new Date(Long.parseLong(recordField[2])));
		    System.out.println("计费："+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))+"元");
		}
	}
}

public class Main{
	public static void main(String[] args) {
	      TelcomUser telcomUser = new TelcomUser("13800138000");
	      telcomUser.generateCommunicateRecord();
	      telcomUser.printDetails();
	}
}