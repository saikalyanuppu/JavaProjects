package comparable;


public class Book implements Comparable<Book> {
	String title;
	int pageCount;


	Book(String title, int pageCount) {
     this.title = title;
     this.pageCount = pageCount;
 }


 public int compareTo(Book OB) {
     return Integer.compare(this.pageCount, OB.pageCount);
 }

 
 public String toString() {
     if (this.title.equals("Java Programming")) 
    	 return  title + ", Pages: " + pageCount;
     else if (this.title.equals("Data Structures")) 
    	 return  title + ", Pages: " + pageCount;
     else 
    	 return title + ", Pages: " + pageCount;
 }
}
