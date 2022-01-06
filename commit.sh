# commit all files in current directory
cd com/baimamboukar/java/fourth_assignment/src
for file in *
do
    git add $file
    git commit -m "committing $file"
    git push
done

# cd - 
# cd class
# for file in *
# do
#     echo $file
#     git add $file
#     git commit -m "compiled $file"
#     git push
# done