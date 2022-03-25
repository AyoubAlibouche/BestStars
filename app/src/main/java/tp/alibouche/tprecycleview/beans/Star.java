package tp.alibouche.tprecycleview.beans;

import tp.alibouche.tprecycleview.R;

public class Star {

        private int id;
        private String name;
        private String img;
        private float star;
        private static int comp;
        public Star(String name, String img, float star) {
            this.id = ++comp;
            this.name = name;
            this.img = img;
            this.star = star;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getImg() {
            return img;
        }
        public void setImg(String img) {
            this.img = img;
        }
        public float getStar() {
            return star;
        }
        public void setStar(float star) {
            this.star = star;
        }

        public static void setComp(int comp) {
        Star.comp = comp;
    }



//    logo = findViewById(R.id.logo);
//        logo.animate().rotation(360f).setDuration(2000);
//        logo.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
//        logo.animate().translationYBy(1000f).setDuration(2000);
//        logo.animate().alpha(0f).setDuration(6000);
}
