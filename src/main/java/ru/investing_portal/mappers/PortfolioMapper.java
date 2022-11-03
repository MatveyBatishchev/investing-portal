package ru.investing_portal.mappers;

import org.mapstruct.*;
import ru.investing_portal.dto.PortfolioDto;
import ru.investing_portal.models.domain.Portfolio;


@Mapper(componentModel = "spring", config = IgnoreUnmappedMapperConfig.class)
public interface PortfolioMapper {

    PortfolioDto toDto(Portfolio portfolio);

    // {transactions} are unmapped properties ↓↓↓
    @Mapping(target = "id", ignore = true) // during creating id will generate automatically
    Portfolio toPortfolio(PortfolioDto portfolioDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePortfolioFromDto(PortfolioDto portfolioDto, @MappingTarget Portfolio entity);
}