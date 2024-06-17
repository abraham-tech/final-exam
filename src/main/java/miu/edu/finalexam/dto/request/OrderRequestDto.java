package miu.edu.finalexam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {
    private LocalDate orderDate;
    private CustomerRequestDto customerRequestDto;
    private List<ProductRequestDto> productRequestDtos;
}
