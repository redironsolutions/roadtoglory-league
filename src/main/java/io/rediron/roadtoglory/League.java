package io.rediron.roadtoglory;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class League {

    @Id private String id;
    private String name;

}
