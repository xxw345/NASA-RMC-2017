import java.util.List;

public class ArenaPointCloud {

	//List of points
	List<Point> pointList;
	
	//Get all the points at once as a list in arbitrary order
	public List<Point> getAll(){ 
		return pointList;
	}
	
	//Get a subset of the points that were updated after the given time
	public List<Point> afterTime(long t){

	}
	//Get a subset of the points inside the given dimensions of a rectangular prism
	public List<Point> insideBox(float minX, float maxX, float minY, float maxY, float minZ, float maxZ){ 
		
	}
	
	//Add the given point object to the cloud, updating if the id is already there
	public void update(Point p){
		if(pointList.get(p.id) == null){
			pointList.add(p);
		}
		else{
			pointList.set(p.id, p);
		}
		
	}
	//Return the point with the given ID
	public Point get(int ID){

	}
}
