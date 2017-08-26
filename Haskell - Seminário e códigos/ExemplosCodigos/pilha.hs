push :: [Int] -> Int -> [Int]
push pilha x = pilha ++ [x]

top :: [Int] -> Int
top [x] = x
top (x:xs) = top xs

pop :: [Int] -> [Int]
pop [] = error "Pilha Vazia"
pop (x:xs) | (x == (top(x:xs))) = xs | otherwise = x:(pop xs)