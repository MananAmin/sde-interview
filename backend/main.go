package main

import (
	"errors"
	"fmt"
	"math"
	"time"
)

func hello(name string) {
	fmt.Printf("hello %s\n", name)
}

type person struct {
	name string
	age  int
}

func sqrt(x float64) (float64, error) {
	if x < 0 {
		return 0, errors.New("undefined for negertive")
	}
	return math.Sqrt(x), nil

}

func inc(x *int) {
	*x++
}

func main() {

	fmt.Println("time is " + time.Now().String())
	cur := time.Now()
	fmt.Printf("time is %s %.2f \n", cur, 22.0/7)

	fmt.Println(cur.Format(time.RFC3339))

	timeString := "2021-08-15 02:30:45"
	theTime, err := time.Parse("2006-01-02 03:04:05", timeString)

	if err != nil {
		fmt.Println(theTime)
	} else {
		fmt.Println("passed")
	}

	x := 10
	fmt.Println(x)

	var a [5]int

	b := [5]int{1, 2, 3, 4, 5}
	a[0] = 7

	for i := 0; i < len(a); i++ {
		fmt.Print(a[i])
		fmt.Println(b[i])
	}

	c := []int{1, 2, 3}
	c = append(c, 10)

	dict := make(map[string]int)
	dict["manan"] = 1
	dict["amin"] = 2

	fmt.Println(dict)

	for index, value := range b {
		fmt.Printf("index = %d  value=%d\n", index, value)
	}

	for key, value := range dict {
		fmt.Println(key, "  ", value)
	}

	hello("manan")

	inp := 4.0
	ans, err := sqrt(inp)

	if err != nil {
		fmt.Println("negetive number passed")

	} else {
		fmt.Printf("sqrt of %f is %.3f\n", inp, ans)

	}
	p := person{name: "manan", age: 24}

	fmt.Println(p)

	i := 7
	fmt.Printf("address of %d is %d\n", i, &i)

	inc(&i)

	fmt.Printf("increased using pointer is %d\n", i)

}
