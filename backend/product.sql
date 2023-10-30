-- Inserting 10 sample rows into the Products table without product_weight and with product_id and product_sku starting from the first available values
INSERT INTO Products (product_id, product_sku, product_name, product_description, product_quantity, product_price, category_id, supplier_id)
VALUES
    (1, 'SKU001', 'Classic White T-Shirt', 'A comfortable and stylish white T-shirt for everyday wear.', 150, 12.99, 1, 1),
    (2, 'SKU002', 'Silver Hoop Earrings', 'Elegant silver hoop earrings for a touch of sophistication.', 50, 24.99, 7, 2),
    (3, 'SKU003', 'Smartphone Holder Stand', 'A convenient stand for your smartphone with adjustable viewing angles.', 100, 9.99, 8, 3),
    (4, 'SKU004', 'Children''s Wooden Puzzle', 'Educational wooden puzzle set for kids to develop problem-solving skills.', 75, 16.50, 9, 4),
    (5, 'SKU005', 'Natural Shampoo', 'Gentle and natural shampoo for healthy and shiny hair.', 200, 7.99, 10, 5),
    (6, 'SKU006', 'Laptop Backpack', 'A durable and stylish backpack designed to carry your laptop and accessories.', 30, 49.99, 2, 1),
    (7, 'SKU007', 'Stainless Steel Watch', 'A sleek and modern stainless steel watch for both casual and formal occasions.', 40, 29.99, 6, 3),
    (8, 'SKU008', 'Wooden Cooking Utensils', 'Set of wooden cooking utensils for safe and non-stick cookware.', 90, 14.99, 2, 4),
    (9, 'SKU009', 'Fitness Tracker Watch', 'Track your daily activities, heart rate, and sleep patterns with our fitness tracker watch.', 60, 39.99, 1, 1),
    (10, 'SKU010', 'Indoor Plants Assortment', 'Bring a touch of nature indoors with our assortment of easy-to-maintain houseplants.', 120, 19.99, 5, 2);

-- Inserting 10 sample rows into the Categories table with category_id starting from 1
INSERT INTO Categories (category_id, category_name)
VALUES
    (1, 'Clothing'),
    (2, 'Accessories'),
    (3, 'Electronics'),
    (4, 'Audio'),
    (5, 'Kitchenware'),
    (6, 'Shoes'),
    (7, 'Jewelry'),
    (8, 'Home Decor'),
    (9, 'Toys'),
    (10, 'Beauty Products');

-- Inserting 10 sample rows into the Suppliers table with supplier_id starting from 1
INSERT INTO Suppliers (supplier_id, supplier_name)
VALUES
    (1, 'Fashion Supplier Inc.'),
    (2, 'Jewelry World Co.'),
    (3, 'ElectroTech Supplies'),
    (4, 'Toy Kingdom Enterprises'),
    (5, 'Beauty Essentials Ltd.'),
    (6, 'Footwear Express'),
    (7, 'Home Decor Creations'),
    (8, 'Electronics Direct'),
    (9, 'Kitchenware Suppliers LLC'),
    (10, 'Toy Emporium Inc.');

