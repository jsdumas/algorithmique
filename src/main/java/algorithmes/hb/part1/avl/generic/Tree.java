package algorithmes.hb.part1.avl.generic;

public interface Tree<T> {
	public void insert(T data);
	public void traverse();
	public void delete(T data);
}