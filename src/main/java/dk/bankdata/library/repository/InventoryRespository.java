package dk.bankdata.library.repository;

import dk.bankdata.library.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRespository extends JpaRepository<Book,Integer> {

}
