package Respon_Modul_5;

public class Graph {
    Vertex head, tail;

    public void insertVertex(String country) {
        Vertex baru = new Vertex(country);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public Vertex findVertex(String country) {
        Vertex current = head;
        while (current != null) {
            if (current.country.equals(country)) {
                return current;
            }
            current = current.next;
        }
        System.out.println("Country isn't available");
        return null;
    }

    public void insertEdge(String start, String end) {
        Vertex firstVertex = findVertex(start);
        Vertex endVertex = findVertex(end);
        Edge newEdge = new Edge();
        if (firstVertex.route == null) {
            firstVertex.route = firstVertex.last = newEdge;
        } else {
            firstVertex.last.next = newEdge;
            firstVertex.last = newEdge;
        }
        firstVertex.last.goal = endVertex;
    }

    public void printVertex() {
        Vertex current = head;
        while (current != null) {
            System.out.println(current.getCountry());
            current = current.next;
        }
    }

    public void printEdge() {
        Vertex current = head;
        Edge visit;
        while (current != null) {
            System.out.print(current.getCountry() + " neigbors with : ");
            visit = current.route;
            while (visit != null) {
                System.out.print("[" + visit.goal.getCountry() + "]");
                visit = visit.next;
            }
            System.out.println();
            current = current.next;
        }
    }

    public void DFS(String start) {
        Vertex startVertex = findVertex(start);
        if (startVertex == null) {
            System.out.println("Country isn't available");
            return;
        }
        Stack stack = new Stack();
        startVertex.visited = true;
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            Vertex current = stack.pop();
            System.out.print(current.getCountry() + " ");

            Edge edge = current.route;
            while (edge != null) {
                if (!edge.goal.visited) {
                    edge.goal.visited = true;
                    stack.push(edge.goal);
                }
                edge = edge.next;
            }
        }
    }

    public void BFS(String start) {
        Vertex startVertex = findVertex(start);
        if (startVertex == null) {
            System.out.println("Country isn't available");
            return;
        }

        Queue queue = new Queue();
        startVertex.visited = true;
        queue.enqueue(startVertex);

        while (!queue.isEmpty()) {
            Vertex current = (Vertex) queue.dequeue();
            System.out.print(current.getCountry() + " ");

            Edge edge = current.route;
            while (edge != null) {
                if (!edge.goal.visited) {
                    edge.goal.visited = true;
                    queue.enqueue(edge.goal);
                }
                edge = edge.next;
            }
        }
    }
}
