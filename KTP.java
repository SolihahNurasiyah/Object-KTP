//Object Class
public class KTP
{
	private String nik;
	private String nama;
	private String ttl;
	private String jk;
	private String alamat;
	private String agama;
	private String status;
	private String pekerjaan;
	private String kewarganegaraan;
	private String goldar;
	private String berlaku;
	
	//Constructor
	public KTP (String nik, String nama, String ttl, String jk, String alamat, String agama, String status, String pekerjaan, String kewarganegaraan, String goldar, String berlaku )
	{
		this.nik = nik;
		this.nama = nama;
		this.ttl = ttl;
		this.jk = jk;
		this.alamat = alamat;
		this.agama = agama;
		this.status = status;
		this.pekerjaan = pekerjaan;
		this.kewarganegaraan = kewarganegaraan;
		this.goldar = goldar;
		this.berlaku = berlaku;
		
	}
	
	//method setter
	public void setNik(String nik)
	{
		nik = nik;
	}
	
	public void setNama(String nama)
	{
		nama = nama;
	}
	
	public void setTtl(String ttl)
	{
		ttl =ttl;
	}
	
	public void setJk(String jk)
	{
		jk = jk;
	}
	
	public void setAlamat(String alamat)
	{
		alamat = alamat;
	}
	
	public void setAgama(String agama)
	{
		agama = agama;
	}
	
	public void setStatus(String status)
	{
		status = status;
	}
	
	public void setPekerjaan(String pekerjaan)
	{
		pekerjaan = pekerjaan;
	}
	
	public void setKewarganegaraan(String kewarganegaraan)
	{
		kewarganegaraan = kewarganegaraan;
	}
	
	public void setGoldar(String goldar)
	{
		goldar = goldar;
	}
	
	public void setBerlaku(String berlaku)
	{
		berlaku = berlaku;
	}
	
	//method getter 
	public String getNik()
	{
		return nik;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public String getTtl()
	{
		return ttl;
	}
	
	public String getJk()
	{
		return jk;
	}
	
	public String getAlamat()
	{
		return alamat;
	}
	
	public String getAgama()
	{
		return agama;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public String getPekerjaan()
	{
		return pekerjaan;
	}
	
	public String getKewarganegaraan()
	{
		return kewarganegaraan;
	}
	
	public String getGoldar()
	{
		return goldar;
	}
	
	public String getBerlaku()
	{
		return berlaku;
	}
		
}