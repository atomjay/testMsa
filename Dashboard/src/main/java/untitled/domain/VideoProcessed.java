package untitled.domain;

import untitled.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String url;
    private Long fileId;
}
