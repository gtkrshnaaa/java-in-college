import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoubleLinkedList {
    Node head, tail;

    public void tambahData(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Data berhasil ditambahkan: " + data);
    }

    public void hapusData(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                System.out.println("Data berhasil dihapus: " + data);
                return;
            }

            current = current.next;
        }

        System.out.println("Data tidak ditemukan: " + data);
    }

    public void tampilkanData() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void urutkanDataBubbleSort() {
        Node current;
        int temp;
        boolean sorted;

        if (head == null) {
            System.out.println("Data kosong.");
            return;
        }

        do {
            sorted = true;
            current = head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    sorted = false;
                }

                current = current.next;
            }
        } while (!sorted);

        System.out.println("Data berhasil diurutkan dengan Bubble Sort");
    }

    public void urutkanDataInsertionSort() {
        if (head == null) {
            System.out.println("Data kosong.");
            return;
        }

        Node current = head;
        Node index;
        int temp;

        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

                index = index.next;
            }

            current = current.next;
        }

        System.out.println("Data berhasil diurutkan dengan Insertion Sort");
    }

    public void urutkanDataQuickSort() {
        if (head == null) {
            System.out.println("Data kosong.");
            return;
        }

        int[] dataArray = toArray();

        quickSort(dataArray, 0, dataArray.length - 1);

        fromArray(dataArray);

        System.out.println("Data berhasil diurutkan dengan Quick Sort");
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void urutkanDataMergeSort() {
        if (head == null) {
            System.out.println("Data kosong.");
            return;
        }

        int[] dataArray = toArray();

        mergeSort(dataArray, 0, dataArray.length - 1);

        fromArray(dataArray);

        System.out.println("Data berhasil diurutkan dengan Merge Sort");
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    private void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private int[] toArray() {
        Node current = head;
        int size = 0;

        while (current != null) {
            size++;
            current = current.next;
        }

        int[] dataArray = new int[size];
        current = head;

        for (int i = 0; i < size; i++) {
            dataArray[i] = current.data;
            current = current.next;
        }

        return dataArray;
    }

    private void fromArray(int[] dataArray) {
        head = tail = null;

        for (int i = 0; i < dataArray.length; i++) {
            tambahData(dataArray[i]);
        }
    }
}

public class tugasLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Urutkan Data (Bubble Sort)");
            System.out.println("5. Urutkan Data (Insertion Sort)");
            System.out.println("6. Urutkan Data (Quick Sort)");
            System.out.println("7. Urutkan Data (Merge Sort)");
            System.out.println("8. Selesai");

            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int newData = scanner.nextInt();
                    doubleLinkedList.tambahData(newData);
                    break;

                case 2:
                    System.out.print("Masukkan data yang akan dihapus: ");
                    int dataHapus = scanner.nextInt();
                    doubleLinkedList.hapusData(dataHapus);
                    break;

                case 3:
                    System.out.println("Data saat ini:");
                    doubleLinkedList.tampilkanData();
                    break;

                case 4:
                    doubleLinkedList.urutkanDataBubbleSort();
                    break;

                case 5:
                    doubleLinkedList.urutkanDataInsertionSort();
                    break;

                case 6:
                    doubleLinkedList.urutkanDataQuickSort();
                    break;

                case 7:
                    doubleLinkedList.urutkanDataMergeSort();
                    break;

                case 8:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}





// import java.util.Scanner;

// public class tugasLinkedList {
//     static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     private Node head = null;
//     private Node tail = null;

//     // Function to add a node to the end of the linked list
//     public void addNode(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             tail = newNode;
//         } else {
//             tail.next = newNode;
//             tail = newNode;
//         }
//     }

//     // Function to display the linked list
//     public void display() {
//         Node current = head;
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     // Function to delete a node with given data
//     public void deleteNode(int data) {
//         Node current = head;
//         Node prev = null;

//         // Check if the node to be deleted is the head
//         if (current != null && current.data == data) {
//             head = current.next;
//             return;
//         }

//         // Search for the node to be deleted
//         while (current != null && current.data != data) {
//             prev = current;
//             current = current.next;
//         }

//         // If the node is not present
//         if (current == null) {
//             System.out.println("Data not found");
//             return;
//         }

//         // Unlink the node from the linked list
//         prev.next = current.next;
//     }

//     // Function to sort the linked list using Bubble Sort
//     public void sortList() {
//         Node current = head, index = null;
//         int temp;
//         if (head == null) {
//            return;
//        }
//        else {
//            while (current != null) {
//                index = current.next;
//                 while (index != null) {
//                    if (current.data > index.data) {
//                        temp = current.data;
//                        current.data = index.data;
//                        index.data = temp;
//                    }
//                     index = index.next;
//                }
//                current = current.next;
//            }
//         }
//     }

//     // Function to search for a node with given data
//     public boolean search(int data) {
//         Node current = head;
//         while (current != null) {
//             if (current.data == data) {
//                 return true;
//             }
//             current = current.next;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         tugasLinkedList linkedListProgram = new tugasLinkedList();

//         int choice;
//         do {
//             System.out.println("1. Tambah Data");
//             System.out.println("2. Hapus Data");
//             System.out.println("3. Tampilkan Data");
//             System.out.println("4. Urutkan Data");
//             System.out.println("5. Pencarian Data");
//             System.out.println("6. Selesai");
//             System.out.print("Pilihan: ");
//             choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Masukkan data baru: ");
//                     int newData = scanner.nextInt();
//                     linkedListProgram.addNode(newData);
//                     break;

//                 case 2:
//                     System.out.print("Masukkan data yang ingin dihapus: ");
//                     int dataToDelete = scanner.nextInt();
//                     linkedListProgram.deleteNode(dataToDelete);
//                     break;

//                 case 3:
//                     System.out.println("Linked List:");
//                     linkedListProgram.display();
//                     break;

//                 case 4:
//                     linkedListProgram.sortList(); // Implement sorting
//                     System.out.println("Linked List diurutkan.");
//                     break;

//                 case 5:
//                     System.out.print("Masukkan data yang dicari: ");
//                     int searchData = scanner.nextInt();
//                     if (linkedListProgram.search(searchData)) {
//                         System.out.println("Data ditemukan.");
//                     } else {
//                         System.out.println("Data tidak ditemukan.");
//                     }
//                     break;

//                 case 6:
//                     System.out.println("Program selesai.");
//                     break;

//                 default:
//                     System.out.println("Pilihan tidak valid.");
//             }

//         } while (choice != 6);

//         scanner.close();
//     }
// }