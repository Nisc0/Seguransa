public class PhotoHandler {

    public PhotoHandler(){
    //TODO: user como atributo ou nao?
        //protected User curr;
    }

    //TODO:
    public boolean addPhoto(Photo photo) {
        return curr.addPhoto(photo);
    }
    
    public Iterable<Photos> getPhotosData(String userID) {
           
        User uID = curr.getFollows(userID);
        if(uID != null) {
            return uID.getAllPhotos();
        }
        else
            return null; // ver se devemos mandar exception
        
    }
    
    public Iterable<> getPhotoOpinion(String userID, String photoID) {
        
        User uID = curr.getFollows(userID);
            if(uID != null) {
                
                
                
                
                
                
                
                
                
                
                
}
