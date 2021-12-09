class car:
    def __init__(self, manfacturer, model, make, trans, color):
        self.manfacturer = manfacturer
        self.model = model
        self.make = make
        self.transmission    = trans
        self.color = color

    def accelerate(self):
	        print(self.manfacturer + " " + self.model + " has started moving")
	
    def stop(self):
        print(self.manfacturer + " " + self.model + " has stopped moving")
	
car1 = car("Toyota", "Corolla", "2015", "Manual", "White")
car2 = car("Maruti", "800", "2013", "Manual", "Red")
car3 = car("Suzuki", "Swift", "2017", "Automatic", "Black")
	
car1.accelerate()
car1.stop()

