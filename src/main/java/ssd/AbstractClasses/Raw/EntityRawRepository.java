package ssd.AbstractClasses.Raw;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import ssd.AbstractClasses.Analytics.Analytics;
import ssd.AbstractClasses.Base.BaseEntity;

import java.util.Optional;

@NoRepositoryBean
public interface EntityRawRepository<T extends EntityRaw<? extends BaseEntity<? extends Analytics>>> extends JpaRepository<T, Long> {

    Optional<T> findById(Long id);

    Optional<T> findByUrl(String url);
}
