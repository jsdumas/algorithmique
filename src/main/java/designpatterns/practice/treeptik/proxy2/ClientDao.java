package designpatterns.practice.treeptik.proxy2;

public interface ClientDao extends Dao {

	@Override
	void save();

	@Override
	void remove();

}
