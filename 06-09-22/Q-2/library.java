package Fresh;

class library {
	String books[]= {"Ansi C","Overview of java","C++ Programming"};
	String auth_names[]= {"E.balaguruswami","E.balaguruswami","yashwant kanetkar"};
	void check(String b_name) throws BookNotFoundException {
		for(int i=0;i<books.length;i++) {
			if(!(b_name.equals(books[i]))) {
				throw new BookNotFoundException("book not found");
			}
			else {
				System.out.print(books[i]+" - "+auth_names[i]);
			}
		}
	}
}
