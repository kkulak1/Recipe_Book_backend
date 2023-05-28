package RecipeBook.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    Recipe findRecipeById(Long id);
    @Override
    Optional<Recipe> findById(Long aLong);
}
