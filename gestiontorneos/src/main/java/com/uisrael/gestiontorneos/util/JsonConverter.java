package com.uisrael.gestiontorneos.util;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverter<T> {
	private final ObjectMapper objectMapper;

	public JsonConverter() {
		this.objectMapper = new ObjectMapper();
	}

	public List<T> Deserializar(String jsonString, TypeReference<List<T>> typeReference) {
		try {
			return objectMapper.readValue(jsonString, typeReference);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
