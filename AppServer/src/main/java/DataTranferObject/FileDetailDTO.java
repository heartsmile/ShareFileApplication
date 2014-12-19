package DataTranferObject;

import java.util.Date;

public class FileDetailDTO {
	int filedetail_id;
	int file_id;
	int state_id;
	String fileName;
	String urlFile;
	String roleFile;
	Date dateUpload;
	int size;
	String checkSum;
	
	public int getFiledetail_id() {
		return filedetail_id;
	}
	public void setFiledetail_id(int filedetail_id) {
		this.filedetail_id = filedetail_id;
	}
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getUrlFile() {
		return urlFile;
	}
	public void setUrlFile(String urlFile) {
		this.urlFile = urlFile;
	}
	public String getRoleFile() {
		return roleFile;
	}
	public void setRoleFile(String roleFile) {
		this.roleFile = roleFile;
	}
	public Date getDateUpload() {
		return dateUpload;
	}
	public void setDateUpload(Date dateUpload) {
		this.dateUpload = dateUpload;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getCheckSum() {
		return checkSum;
	}
	public void setCheckSum(String checkSum) {
		this.checkSum = checkSum;
	}
	
}
