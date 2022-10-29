package 泛型与容器;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Name implements Comparable{
	private String name;
	private String id;
	public Name(String name,String id) {
		this.name = name;
		this.id = id;
	}
	//get set
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	//重写hashcode
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	//toString
	@Override
	public String toString() {
		return "Name [name=" + name + ", id=" + id + "]";
	}
	//重写equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Name)) {
			return false;
		}
		Name other = (Name) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	//重写compareTo
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
public class comparable接口 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new LinkedList();
		l1.add(new Name("Kar1","M"));
		l1.add(new Name("steven", "Lee"));
		l1.add(new Name("John", "o"));
		l1.add(new Name("Tom", "M"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}
}
