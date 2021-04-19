package ConsumirApi;

public class ExecutorChamadas {


    public static void main(String args[]) {
      ConsumirApi consumir = ConsumirApi.getInstance();

        System.out.println(consumir.doRequest("id"));

    }
}