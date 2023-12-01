package ie.ul.libraryfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class BookFeed extends AppCompatActivity {

    private RecyclerView courseRV;

    // Variables for taking in book rating and name
    public String bookTitle;
    public int bookRating;
    public EditText TitleInput;
    public EditText RatingInput;
    public Button uploadButton;

    // Arraylist for storing data
    private ArrayList<libraryModel> libraryModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_feed);
        courseRV = findViewById(R.id.idRVCourse);
        TitleInput = (EditText) findViewById(R.id.bookTitleEdit);
        RatingInput = (EditText) findViewById(R.id.ratingEdit);

        //Button for uploading book rating
        uploadButton = (Button) findViewById(R.id.uploadButton);
        uploadButton.setOnClickListener(new View.OnClickListener() {

        //Onclick method for button
            @Override
            public void onClick(View view) {
                bookTitle = TitleInput.getText().toString();
                bookRating = Integer.parseInt(RatingInput.getText().toString());

                libraryModelArrayList.add(new libraryModel(bookTitle, bookRating, R.drawable.emptybook));

                Intent in = new Intent(BookFeed.this, UploadActivity.class);
                startActivity(in);
            }
        });

        // here we have created new array list and added data to it.
        libraryModelArrayList = new ArrayList<>();
        libraryModelArrayList.add(new libraryModel("Children of the Matrix", 3, R.drawable.icke));
        libraryModelArrayList.add(new libraryModel("Illuminati Secrets", 2, R.drawable.mentz));
        libraryModelArrayList.add(new libraryModel("The Way of Kings", 5, R.drawable.sanderson));
        libraryModelArrayList.add(new libraryModel("Rhythm of War", 4, R.drawable.sanderson2));
        libraryModelArrayList.add(new libraryModel("Mistborn", 5, R.drawable.sanderson3));
        libraryModelArrayList.add(new libraryModel("Amercian Psycho", 3, R.drawable.ellis));


        // we are initializing our adapter class and passing our arraylist to it.
        CourseAdapter courseAdapter = new CourseAdapter(this, libraryModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}