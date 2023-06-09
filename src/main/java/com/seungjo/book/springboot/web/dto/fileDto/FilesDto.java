package com.seungjo.book.springboot.web.dto.fileDto;

import com.seungjo.book.springboot.domain.file.Files;
import lombok.Builder;
import lombok.Data;

@Data
public class FilesDto {

    private Long id; // id
    private String originalFileName;
    private String savedFileName;
    private Long size;
    private Long postId;

    @Builder
    public FilesDto(Long id, String originalFileName, String savedFileName, Long size, Long postId) {
        this.id = id;
        this.originalFileName = originalFileName;
        this.savedFileName = savedFileName;
        this.size = size;
        this.postId = postId;
    }

    public FilesDto(Files entity) {
        this.id = entity.getId();
        this.originalFileName = entity.getOriginalFileName();
        this.savedFileName = entity.getSavedFileName();
        this.size = entity.getSize();
        this.postId = entity.getPostId();
    }

    public Files toEntity() {
        return Files.builder()
                .originalFileName(originalFileName)
                .savedFileName(savedFileName)
                .size(size)
                .postId(postId)
                .build();
    }
}
