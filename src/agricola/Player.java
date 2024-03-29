package agricola;

public class Player {
	
	public boolean human, hasChild;
	public int food, reed, wood, clay, stone, grain, vege, family, rooms, activefam, sheep, cattle, boar, field, empty, pasture, stable, score;
	public char roomtype;
	public boolean hasOven;
//	public farm
	
	public Player(){
		food=0;
		reed=0;
		wood=0;
		clay=0;
		stone=0;
		grain=0;
		vege=0;
		family=2;
		activefam=2;
		rooms=2;
		roomtype='w';
		sheep=0;
		cattle=0;
		boar=0;
		field=0;
		empty=13;
		pasture=0;
		stable=0;
		score=0;
		hasOven=false;
	}
	
	public int getScore(){
		return score;
	}
	
	public void calcScore(){
		if (field<2)
			score--;
		else
			score=score+field-1;
			
		score+=pasture;
		
		score=score+(grain/2);
		
		if (vege<1)
			score--;
		else
			score+=vege;
			
		if (sheep<1)
			score--;
		else 
			score=score+(sheep/2);
			
		if (boar<1)
			score--;
		else 
			score=score+(boar/2);
			
		if (cattle<1)
			score--;
		else 
			score+=cattle;
			
		score-=empty;
		
		score+=stable;
		
		if (roomtype=='c')
			score+=rooms;
		
		if (roomtype=='s')
			score=score+(rooms*2);
			
		score=score+(family*3);
		
	}
	
	public void addScore(int n){
		score+=n;
	}
	
	public boolean hasOven(){
		return hasOven;
	}
	public void setOven(){
		hasOven=true;
	}
	
	public void addField(){
		field+=1;
	}
	
	public void decVege(){
		vege--;
	}
	public void decGrain(){
		grain--;
	}
	
	public int getField(){
		return field;
	}
	
	public void decEmpty(int n){
		empty-=n;
	}
	
	public int getPasture(){
		return pasture;
	}
	
	public void addPasture(int n){
		pasture+=n;
	}
	
	public int getStable(){
		return stable;
	}
	
	public void addStable(int n){
		stable+=n;
	}
	
	public int getEmpty(){
		return empty;
	}
	
	
	public void addSheep(int n){
		sheep+=n;
	}
	
	public int getSheep(){
		return sheep;
	}
	
	public void addBoar(int n){
		boar+=n;
	}
	
	public int getBoar(){
		return boar;
	}
	
	public void addCattle(int n){
		cattle+=n;
	}
	
	public int getCattle(){
		return cattle;
	}
	
	public boolean hasChild(){
		return hasChild;
	}
	
	public void setChild(){
		hasChild=!hasChild;
	}
	
	public int getRoomType(){
		return roomtype;
	}
	
	public void setRoomType(char r){
		roomtype=r;
	}
	
	public int getFood(){
		return food;
	}
	
	public int getReed(){
		return reed;
	}
	
	public int getWood(){
		return wood;
	}
	
	public int getClay(){
		return clay;
	}
	
	public int getStone(){
		return stone;
	}
	public int getGrain(){
		return grain;
	}
	public int getVege(){
		return vege;
	}
	public int getFamily(){
		return family;
	}
	public int getRooms(){
		return rooms;
	}
	
	public int getActiveFamily(){
		return activefam;
	}

	public void useFam(){
		activefam--;
	}
	
	public void resetFam(){
		activefam=family;
	}
	
	public void addFood(int n){
		food=food+n;
	}
	
	public void addReed(int n){
		reed=reed+n;
	}
	
	public void addWood(int n){
		wood=wood+n;
	}
	
	public void addClay(int n){
		clay=clay+n;
	}
	
	public void addStone(int n){
		stone=stone+n;
	}
	public void addGrain(){
		grain++;
	}
	public void addVege(){
		vege++;
	}
	public void addFamily(){
		family++;
		hasChild=true;
	}
	public void addRooms(int n){
		rooms=rooms+n;
	}
	
	
	
	
	
	
}