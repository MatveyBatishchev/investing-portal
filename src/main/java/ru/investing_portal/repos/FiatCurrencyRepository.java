package ru.investing_portal.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.investing_portal.models.domain.FiatCurrency;

@Repository
public interface FiatCurrencyRepository extends JpaRepository<FiatCurrency, Integer> {

    @Modifying
    @Transactional
    @Query(value = "update main.fiat_currency set rate = :rate, last_updated = now() where symbol = :symbol", nativeQuery = true)
    void updateFiatCurrency(@Param(value = "symbol") String symbol, @Param(value = "rate") double rate);

}
