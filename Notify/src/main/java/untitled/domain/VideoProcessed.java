package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private Long fileId;
}


