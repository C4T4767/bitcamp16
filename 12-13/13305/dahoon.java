import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class City {
    long cost;
    int distance;

    public City(int cost, int distance) {
        this.cost = cost;
        this.distance = distance;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        City[] cities = new City[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            cities[i] = new City(0, Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            if (i == N - 1) {
                cities[i] = new City(Integer.parseInt(st.nextToken()), 0);
            } else {
                cities[i].cost = Integer.parseInt(st.nextToken());
            }
        }

        long cost = 0;
        City cur = cities[0];
        for (int j = 0; j < N; j++) {
            if (cur.cost <= cities[j].cost) {
                cost += cur.cost * cities[j].distance;
            } else {
                cur = cities[j];
                cost += cur.cost * cur.distance;
            }
        }

        bw.write(cost + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
