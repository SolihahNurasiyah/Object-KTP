//Driver Clas
public class ProgramKTP
{
	public static void main(String [] args)
	{
		KTP ktp = new KTP (args [0], args[1], args[2], args[3], args[4], args[5], args[6], args[7], args[8], args[9], args[10]);
		
		
		String nik = ktp.getNik();
		String nama = ktp.getNama();
		String ttl = ktp.getTtl();
		String jk = ktp.getJk();
		String alamat = ktp.getAlamat();
		String agama = ktp.getAgama();
		String status = ktp.getStatus();
		String pekerjaan = ktp.getPekerjaan();
		String kewarganegaraan = ktp.getKewarganegaraan();
		String goldar = ktp.getGoldar();
		String berlaku = ktp.getBerlaku();
		
		System.out.println("NIK = "+nik);
		System.out.println("Nama = "+nama);
		System.out.println("TTL = "+ttl);
		System.out.println("Jenis Kelamin = "+jk);
		System.out.println("Alamat = "+alamat);
		System.out.println("Agama = "+agama);
		System.out.println("Status = "+status);
		System.out.println("Pekerjaan = "+pekerjaan);
		System.out.println("Kewarganegaraan = "+kewarganegaraan);
		System.out.println("Golongan Darag = "+goldar);
		System.out.println("Berlaku Hingga = "+berlaku);
	}
}