package model;

public class User {
	String Uid, Name, Pass, Tel, CMND, Birth, AvatarPath;
	byte[] Avatar;
	public User() {}
	public User(String Uid, String Name, String Pass, String Tel, String CMND, String Birth, byte[] Avatar) {
		this.Uid = Uid;
		this.Name = Name;
		this.Pass = Pass;
		this.Tel = Tel;
		this.CMND = CMND;
		this.Birth = Birth;
		this.Avatar = Avatar;
	}
	public User(String Uid) {
		this.Uid = Uid;
	}

	public String getUid() {
		return Uid;
	}

	public void setUid(String uid) {
		Uid = uid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String pass) {
		Pass = pass;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public byte[] getAvatar() {
		return Avatar;
	}

	public void setAvatar(byte[] avatar) {
		Avatar = avatar;
	}

	public String getAvatarPath() {
		return AvatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		AvatarPath = avatarPath;
	}
}
