package com.cvaldiviape.dto.response.page;

import java.util.List;
import com.cvaldiviape.dto.response.TypeDocumentResponseDTO;
import com.cvaldiviape.dto.response.page.base.PageBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class TypeDocumentsPageResponseDTO {

	private List<TypeDocumentResponseDTO> typeDocuments;

}