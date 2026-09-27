class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<int[]>[] graph = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int[] time : times){

            int from = time[0];
            int to = time[1];
            int weight = time[2];

            graph[from].add(new int[]{to, weight});
        }

        PriorityQueue<int[]> heap =
            new PriorityQueue<>((a,b) -> a[0] - b[0]);

        dist[k] = 0;
        heap.add(new int[]{0, k});

        while(!heap.isEmpty()){

            int[] current = heap.poll();

            int distance = current[0];
            int nod = current[1];

            if(distance > dist[nod]){
                continue;
            }

            for(int[] edges : graph[nod]){

                int next = edges[0];
                int weight = edges[1];

                int newdistance = distance + weight;

                if(newdistance < dist[next]){
                    dist[next] = newdistance;
                    heap.add(new int[]{newdistance, next});
                }
            }
        }

        int time = 0;

        for(int i = 1; i <= n; i++){

            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }

            time = Math.max(time, dist[i]);
        }

        return time;
    }
}