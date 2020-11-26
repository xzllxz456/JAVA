package dao.Imple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import dao.MemberDao;
import dto.Batter;
import dto.Pitcher;
import singleton.SingletonClass;

public class DataLoad implements MemberDao {
	private File file;
	
	public DataLoad(String filename) {
		file = new File("D:\\tmp\\" + filename + ".txt");
	}
	
	@Override
	public void proc() {
		SingletonClass si = SingletonClass.getInstance();
		String str = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			// data를 저장
			while((str = br.readLine()) != null) {
				String data[] = str.split("-");
				int pos = Integer.parseInt(data[0]);
				if(pos < 2000) {
					si.getList().add( new Pitcher(
							Integer.parseInt(data[0]), 	// 번호
											data[1], 	// 이름
							Integer.parseInt(data[2]), 	// 나이
							Double.parseDouble(data[3]), // 신장
							Integer.parseInt(data[4]), 	// 승
							Integer.parseInt(data[5]), 	// 패
							Double.parseDouble(data[6]) ) );	// 방어율
				}
				else {
					si.getList().add( new Batter(
							Integer.parseInt(data[0]), 	// 번호
											data[1], 	// 이름
							Integer.parseInt(data[2]), 	// 나이
							Double.parseDouble(data[3]), // 신장
							Integer.parseInt(data[4]), 	// 타수
							Integer.parseInt(data[5]), 	// 안타 수
							Double.parseDouble(data[6]) ) );	// 타율				
				}	
			}
			br.close();
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
