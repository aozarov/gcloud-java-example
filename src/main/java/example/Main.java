package example;

import com.google.gcloud.storage.BucketInfo;
import com.google.gcloud.storage.ListResult;
import com.google.gcloud.storage.Storage;
import com.google.gcloud.storage.StorageFactory;
import com.google.gcloud.storage.StorageOptions;

import java.util.Scanner;

public class Main {

  public static void main(String... args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter project id: ");
    String projectId = input.nextLine();
    StorageOptions options = StorageOptions.builder().projectId(projectId).build();
    Storage storage = StorageFactory.instance().get(options);
    ListResult<BucketInfo> listing = storage.list();
    for (BucketInfo b : listing) {
      System.out.println(b);
    }
  }
}
