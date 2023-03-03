package untitled.domain;

import untitled.domain.VideoProcessed;
import untitled.VideoProcessApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Video_table")
@Data

public class Video  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String url;
    
    
    
    
    
    private Long fileId;

    @PostPersist
    public void onPostPersist(){


        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();

    }

    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoProcessApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void processVideo(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

        
    }


}
