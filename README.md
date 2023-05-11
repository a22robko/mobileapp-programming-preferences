I denna uppgift hade man en secondActivity och en MainActivity i Main activity skulle det finnas en 
knapp när användaren trycker på knappen skall hen komma till SecondActivity. I SecondActivity skall
Användaren skriva en ågot occh senare trycka på save knappen. När hen trycker på saveknappen skall 
användaren komma till MainActivity och där skall texten synas. Trycker användaren på button knappen 
igen skall texten synas på secondActicity sidan. 


Förklara kod:

Jag valde denna kod eftersom den här Koden hämtar och visar data från SharedPreferences i MainActivity.
När användaren klickar på knappen "button" i MainActivity öppnas SecondActivity och användaren kan 
redigera och spara data till SharedPreferences. När SecondActivity stängs så visas det nya värdet i 
TextView i MainActivity.
```  
        myPreferenceRef = getSharedPreferences("MyPreferencesName", MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();
        
        TextView prefTextRef = findViewById(R.id.Robin);
        prefTextRef.setText(myPreferenceRef.getString("MyEditTextValue", "No preference found."));

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 1);
                
            }
        });
    
```

![](Robin1.png)
![](Robin2.png)


Fördel:
Fördel med SharedPreferences är genom att använda SharedPreferences
kan du enkelt få åtkomst till att spara och hämta värden. Detta gör 
det smidigt att hantera preferenser och data.


Nackdel:
En nackdel kan vara att det kan vara svårt att hantera data som lagras i 
SharedPreferences när applikationen växer och mer data behöver hanteras.