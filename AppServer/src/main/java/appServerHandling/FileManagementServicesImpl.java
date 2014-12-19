package appServerHandling;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DataTranferObject.FileDetailDTO;

public class FileManagementServicesImpl extends UnicastRemoteObject implements FileManagementServices {

	
	public FileManagementServicesImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String UploadFile(String userName, String urlFile) throws RemoteException{
		
		return "";
	}
	public String DownloadFile(String IP, String urlFile)
			throws RemoteException {
		// TODO Auto-generated method stub
		return "";
	}
	
	public int InsertFileInfo(String userName, FileDetailDTO fileDetail){
		ConnectDatatbase connect =  new ConnectDatatbase();
		String sqlInsertFile = String.format("INSERT INTO filedetail (user_id, state_id, filename, urlfile, rolefile, dateupload, size, checksum) "
          +"VALUES (?,?,?,?,?,?,?,?)");
		
		try {
			PreparedStatement statement = connect.GetPrepareStatement(sqlInsertFile);
			statement.setInt(1, fileDetail.getFile_id());
			statement.setInt(2, fileDetail.getState_id());
			statement.setObject(3, fileDetail.getFileName());
			statement.setObject(4, fileDetail.getUrlFile());
			statement.setObject(5, fileDetail.getRoleFile());
			statement.setObject(6, fileDetail.getDateUpload());
			statement.setObject(7, fileDetail.getSize());
			statement.setObject(8, fileDetail.getCheckSum());
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	

}
