package com.ouri.SortingSpringBoot;


import java.io.IOException;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

	
@RestController
	public class Resources {
	ObjectMapper map = new ObjectMapper();
	 	
		@GetMapping("/bubblesort")
		@ResponseBody
		public int[] bubbleSort(@RequestParam(value = "array") int [] array)
		{
			array = SortingMethods.bubbleSortMethod(array);
			return array;
		}
		
		@GetMapping("/insertionsort")
		@ResponseBody
		public int[] insertionSort(@RequestParam(value = "array") int [] array)
		{
			array = SortingMethods.insertionSortMethod(array);
			return array;
		}
		
		@GetMapping("/selectionsort")
		@ResponseBody
		public int[] selectionSort(@RequestParam(value = "array") int [] array)
		{
			array = SortingMethods.selectionSortMethod(array);
			return array;
		}
		
		@GetMapping("/heapsort")
		@ResponseBody
		public int[] heapSort(@RequestParam(value = "array") int [] array)
		{
			array = SortingMethods.heapSortMethod(array);
			return array;
		}
		
		
		@GetMapping("/quicksort")
		@ResponseBody
		public int[] quickSort(@RequestParam(value = "array") int [] array,@RequestParam(value = "begin") int begin,
				@RequestParam(value = "end") int end)
		{
			array = SortingMethods.quickSortMethod(array, begin, end);
			return array;
		}
		
		@GetMapping("/mergesort")
		@ResponseBody
		public int[] mergeSorting(@RequestParam(value = "array") int [] array,@RequestParam(value = "left") int left,
				@RequestParam(value = "mid") int mid,@RequestParam(value = "right") int right)
		{
			 array = SortingMethods.mergeSort(array, left, right);
			return array;
		}
		
		
		@GetMapping("/StringPalindrome")
		@ResponseBody
		public String StringPalindrome(@RequestParam(value="string") String string)
		{
			
			String answer = interviewQuestionsMethods.StringPalindrome(string);
			
			return answer;
		}

		@GetMapping("/IntegerPalindrome")
		@ResponseBody
		public String IntegerPalindrome(@RequestParam(value="number") int number)
		{
			String s = String.valueOf(number);
			s.trim();
			if(s == null || s=="")
			{
				return "please enter a number";
			}
			else
			{
			String answer = interviewQuestionsMethods.IntegerPalindrome(number);
			return answer;
			}
			
		}
		
	
		
		
		


}
