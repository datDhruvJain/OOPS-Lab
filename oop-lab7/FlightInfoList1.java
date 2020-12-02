import java.util.Scanner;
import java.util.ArrayList;
class FlightInfo{
        private String flightNo;
        private String source;
        private String destination;
        private float cost;

        void setFlightNo(String flightNo){
                this.flightNo = flightNo;
        }

        String getFlightNo(){
                return flightNo;
        }

        void setSource(String source){
                this.source = source;
        }

        String getSource(){
                return source;
        }
        
        void setDestination(String destination){
                this.destination = destination;
        }

        String getDestination(){
        return destination;
        }

        void setCost(float cost){
                this.cost = cost;
        }

        float getCost(){
                return cost;
        }

}

class FlightInfoList1{

        ArrayList<FlightInfo> flist = new ArrayList<FlightInfo>();
        ArrayList<String[]> flightDestList = new ArrayList<String[]>();

        FlightInfoList1(){
                System.out.println("Enter details: ");
                Scanner scan = new Scanner(System.in);
                
                boolean cont = true;
                int count = 0;
                while(cont == true){
                        System.out.println("pl enter the flight no, srcm dest and cost(flightno = '' to stop");
                        String inp = scan.nextLine();
                        String[] inparr = inp.split(" ",0);
                        if(inparr[0].equals("exit")){cont=false;break;}
                        FlightInfo fl = new FlightInfo();
                        flist.add(fl);
                        flist.get(count).setFlightNo(inparr[0]);
                        System.out.println(inparr[1]);
                        flist.get(count).setSource(inparr[1]);
                        flist.get(count).setDestination(inparr[2]);
                        flist.get(count).setCost(Float.parseFloat(inparr[3]));
                        count++;           
                }
        }
        public void addFlightInfo(String fno, String src, String dest, float cost){
                String[] pair = new String[2];
                pair[0] = dest;
                pair[1] = fno;
                flightDestList.add(pair);
        }
        public ArrayList<FlightInfo> getFlightSrcDest(String src, String dest){
                for(int i=0; i<flist.size(); i++){
                        if(flist.get(i).getSource().equals(src) & flist.get(i).getDestination().equals(dest)){
                                System.out.println(flist.get(i).getFlightNo() + " " + flist.get(i).getSource() + " " + flist.get(i).getDestination() + " " + flist.get(i).getCost());
			}
                }
                return null;
        }
        public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		FlightInfoList1 fl = new FlightInfoList1();

		System.out.println("Enter Source");
		String source = scan.next();

		System.out.println("Enter Destination");
		String dest = scan.next();
                fl.getFlightSrcDest(source,dest);
        }
}

